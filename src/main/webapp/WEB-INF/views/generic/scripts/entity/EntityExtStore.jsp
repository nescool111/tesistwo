<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script>

function ${entityName}ExtStore(){
    
    var Instance = this;
    
    var util= new Util();
    
    
    Instance.get${entityName}Store= function(modelName){
        var store = Ext.create('Ext.data.Store', {
            model: modelName,
            autoLoad: false,
            autoSync: ${viewConfig.defaultAutoSave},
            pageSize: ${viewConfig.maxResultsPerPage},
            remoteSort: true,
            proxy: {
                type: 'ajax',
                batchActions: false,
                simpleSortMode: true,
                actionMethods : {
                    create : 'POST',
                    read   : 'GET',
                    update : 'POST',
                    destroy: 'GET'
                },
                api: {
                    read: Ext.context+'/rest/${entityRef}/find.htm',
                    create: Ext.context+'/rest/${entityRef}/create.htm',
                    update: Ext.context+'/rest/${entityRef}/update.htm',
                    destroy: Ext.context+'/rest/${entityRef}/delete.htm'
                },
                reader: {
                    type: 'json',
                    successProperty: 'success',
                    root: 'data',
                    totalProperty: 'totalCount',
                    messageProperty: 'message'
                },
                writer: {
                    type: 'json',
                    encode: true,
                    writeAllFields: false,
                    root: 'data'
                },
                extraParams: {
                    filter: null
                },
                listeners: {
                    exception: function(proxy, response, operation){
                        var errorMsg= operation.getError();
                        if(typeof errorMsg === "object"){
                            errorMsg= "Error de servidor";
                        }
                        Ext.MessageBox.show({
                            title: 'REMOTE EXCEPTION',
                            msg: errorMsg,
                            icon: Ext.MessageBox.ERROR,
                            buttons: Ext.Msg.OK
                        });
                    }
                }
            },
            listeners: {
                load: function() {
                    var gridComponent= null;
                    if(this.gridContainer){
                        gridComponent= this.gridContainer.child('#grid'+modelName);
                        gridComponent.getSelectionModel().deselectAll();
                    }
                },
                write: function(proxy, operation){
                    if (operation.action === 'destroy') {
                        Ext.MessageBox.alert('Status', operation.resultSet.message);
                    }
                }
            },
            sorters: [{
                property: '${viewConfig.defaultOrderBy}',
                direction: '${viewConfig.defaultOrderDir}'
            }],
            formContainer:null,
            gridContainer:null
        });
        
        return store;
    };
    
    <c:if test="${viewConfig.activeGridTemplateAsParent || viewConfig.activeGridTemplateAsChild}">
    Instance.get${entityName}TemplateStore= function(modelName){
        var store = Ext.create('Ext.data.Store', {
            model: modelName,
            autoLoad: false,
            pageSize: ${viewConfig.maxResultsPerPage},
            remoteSort: true,
            proxy: {
                type: 'ajax',
                batchActions: false,
                simpleSortMode: true,
                actionMethods : {
                    read   : 'GET'
                },
                api: {
                    read: Ext.context+'/rest/${entityRef}/find.htm'
                },
                reader: {
                    type: 'json',
                    successProperty: 'success',
                    root: 'data',
                    totalProperty: 'totalCount',
                    messageProperty: 'message'
                },
                extraParams: {
                    filter: null,
                    templateName: '${viewConfig.gridTemplate.templateName}',
                    numColumns: ${viewConfig.gridTemplate.numColumns}
                },
                listeners: {
                    exception: function(proxy, response, operation){
                        var errorMsg= operation.getError();
                        if(typeof errorMsg === "object"){
                            errorMsg= "Error de servidor";
                        }
                        Ext.MessageBox.show({
                            title: 'REMOTE EXCEPTION',
                            msg: errorMsg,
                            icon: Ext.MessageBox.ERROR,
                            buttons: Ext.Msg.OK
                        });
                    }
                }
            },
            listeners: {
                load: function() {
                    var gridComponent= null;
                    if(this.gridContainer){
                        gridComponent= this.gridContainer.child('#grid'+modelName);
                        gridComponent.getSelectionModel().deselectAll();
                    }
                }
            },
            sorters: [{
                property: '${viewConfig.defaultOrderBy}',
                direction: '${viewConfig.defaultOrderDir}'
            }],
            formContainer:null,
            gridContainer:null
        });
        
        return store;
    };
    </c:if>

    Instance.find${entityName}= function(filter, func){
        Ext.Ajax.request({
            url: Ext.context+"/rest/${entityRef}/find.htm",
            method: "GET",
            params: "filter="+filter,
            success: function(response){
                var responseText= Ext.decode(response.responseText);
                func(responseText);
            },
            failure: function(response){
                console.log(response.responseText);
            }
        });
    };
    
    Instance.save${entityName}= function(operation, data, func){
        Ext.Ajax.request({
            url: Ext.context+"/rest/${entityRef}/"+operation+".htm",
            method: "POST",
            params: "data="+encodeURIComponent(data),
            success: function(response){
                var responseText= Ext.decode(response.responseText);
                func(responseText);
            },
            failure: function(response){
                console.log(response.responseText);
            }
        });
    };
    
    Instance.cargar${entityName}= function(id${entityName}, func){
        Ext.Ajax.request({
            url: Ext.context+"/rest/${entityRef}/load.htm",
            method: "GET",
            params: "data={'id':"+id${entityName}+"}",
            success: function(response){
                var responseText= Ext.decode(response.responseText);
                func(responseText.data);
            },
            failure: function(response){
                console.log(response.responseText);
            }
        });
    };
    
    Instance.upload${entityName}= function(form, idEntity, func){
        form.submit({
            url: Ext.context+"/rest/${entityRef}/upload/"+idEntity+".htm",
            waitMsg: 'Subiendo archivo...',
            success: function(form, action) {
                func(action.result);
            }
        });
    };
    
    Instance.deleteByFilter${entityName}= function(filter, func){
        Ext.Ajax.request({
            url: Ext.context+"/rest/${entityRef}/delete/byfilter.htm",
            method: "POST",
            params: "filter="+filter,
            success: function(response){
                var responseText= Ext.decode(response.responseText);
                func(responseText);
            },
            failure: function(response){
                console.log(response.responseText);
            }
        });
    };

}
</script>
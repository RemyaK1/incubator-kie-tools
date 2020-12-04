package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.StyleInjector;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.Widget;
import elemental2.dom.HTMLAnchorElement;
import elemental2.dom.HTMLDivElement;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.jboss.errai.common.client.api.elemental2.IsElement;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.shared.DataFieldMeta;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;
import org.kie.workbench.common.dmn.client.editors.types.listview.constraint.enumeration.DataTypeConstraintEnumeration.View;
import org.kie.workbench.common.dmn.client.editors.types.listview.constraint.enumeration.DataTypeConstraintEnumerationView;
import org.uberfire.client.mvp.HasPresenter;
import org.uberfire.client.mvp.UberElemental;

public class Type_factory__o_k_w_c_d_c_e_t_l_c_e_DataTypeConstraintEnumerationView__quals__j_e_i_Any_j_e_i_Default extends Factory<DataTypeConstraintEnumerationView> { public interface o_k_w_c_d_c_e_t_l_c_e_DataTypeConstraintEnumerationViewTemplateResource extends Template, ClientBundle { @Source("org/kie/workbench/common/dmn/client/editors/types/listview/constraint/enumeration/DataTypeConstraintEnumerationView.html") public TextResource getContents(); }
  public Type_factory__o_k_w_c_d_c_e_t_l_c_e_DataTypeConstraintEnumerationView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DataTypeConstraintEnumerationView.class, "Type_factory__o_k_w_c_d_c_e_t_l_c_e_DataTypeConstraintEnumerationView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DataTypeConstraintEnumerationView.class, Object.class, View.class, UberElemental.class, IsElement.class, HasPresenter.class, org.jboss.errai.ui.client.local.api.elemental2.IsElement.class });
  }

  public void init(final Context context) {
    StyleInjector.inject("/*\n * Copyright 2019 Red Hat, Inc. and/or its affiliates.\n *\n * Licensed under the Apache License, Version 2.0 (the \"License\");\n * you may not use this file except in compliance with the License.\n * You may obtain a copy of the License at\n *\n *     http://www.apache.org/licenses/LICENSE-2.0\n *\n * Unless required by applicable law or agreed to in writing, software\n * distributed under the License is distributed on an \"AS IS\" BASIS,\n * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n * See the License for the specific language governing permissions and\n * limitations under the License.\n */\n[data-i18n-prefix=\"DataTypeConstraintEnumerationView.\"] {\n  background-image: linear-gradient(to bottom, #efefef 0%, #ffffff 9%, #ffffff 100%);\n  padding: 0 5px;\n  height: 200px;\n  overflow-y: scroll;\n}\n[data-i18n-prefix=\"DataTypeConstraintEnumerationView.\"] [data-field=\"add-icon\"] {\n  float: right;\n  margin: 5px;\n}\n[data-i18n-prefix=\"DataTypeConstraintEnumerationView.\"] [data-field=\"add-icon\"] i {\n  margin-right: 2px;\n}\n[data-i18n-prefix=\"DataTypeConstraintEnumerationView.\"] .dragarea {\n  position: relative;\n}\n[data-i18n-prefix=\"DataTypeConstraintEnumerationView.\"] .draggable {\n  width: 490px;\n  padding-left: 20px;\n  transition: top .1s;\n  position: absolute;\n  z-index: 1;\n  -webkit-touch-callout: none;\n  -webkit-user-select: none;\n  -khtml-user-select: none;\n  -moz-user-select: -moz-none;\n  -ms-user-select: none;\n  user-select: none;\n  height: 40px;\n}\n[data-i18n-prefix=\"DataTypeConstraintEnumerationView.\"] .draggable.highlighted {\n  z-index: 2;\n}\n[data-i18n-prefix=\"DataTypeConstraintEnumerationView.\"] .draggable [data-field=\"value-text\"] {\n  display: inline-block;\n  padding: 5px 0;\n  height: 30px;\n  margin-top: -2px;\n}\n[data-i18n-prefix=\"DataTypeConstraintEnumerationView.\"] [data-field=\"add-button-container\"] {\n  position: relative;\n}\n[data-i18n-prefix=\"DataTypeConstraintEnumerationView.\"].kie-days-and-time-duration .draggable {\n  height: 55px;\n}\n[data-i18n-prefix=\"DataTypeConstraintEnumerationView.\"].kie-days-and-time-duration .draggable [data-field=\"value-text\"] {\n  display: inline-block;\n  padding: 13px 0;\n  height: 45px;\n}\n\n");
  }

  public DataTypeConstraintEnumerationView createInstance(final ContextManager contextManager) {
    final HTMLDivElement _addButtonContainer_2 = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    final HTMLAnchorElement _addIcon_1 = (HTMLAnchorElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLAnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    final HTMLDivElement _items_0 = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    final DataTypeConstraintEnumerationView instance = new DataTypeConstraintEnumerationView(_items_0, _addIcon_1, _addButtonContainer_2);
    registerDependentScopedReference(instance, _addButtonContainer_2);
    registerDependentScopedReference(instance, _addIcon_1);
    registerDependentScopedReference(instance, _items_0);
    setIncompleteInstance(instance);
    o_k_w_c_d_c_e_t_l_c_e_DataTypeConstraintEnumerationViewTemplateResource templateForDataTypeConstraintEnumerationView = GWT.create(o_k_w_c_d_c_e_t_l_c_e_DataTypeConstraintEnumerationViewTemplateResource.class);
    Element parentElementForTemplateOfDataTypeConstraintEnumerationView = TemplateUtil.getRootTemplateParentElement(templateForDataTypeConstraintEnumerationView.getContents().getText(), "org/kie/workbench/common/dmn/client/editors/types/listview/constraint/enumeration/DataTypeConstraintEnumerationView.html", "");
    TemplateUtil.translateTemplate("org/kie/workbench/common/dmn/client/editors/types/listview/constraint/enumeration/DataTypeConstraintEnumerationView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfDataTypeConstraintEnumerationView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfDataTypeConstraintEnumerationView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(3);
    dataFieldMetas.put("items", new DataFieldMeta());
    dataFieldMetas.put("add-icon", new DataFieldMeta());
    dataFieldMetas.put("add-button-container", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.kie.workbench.common.dmn.client.editors.types.listview.constraint.enumeration.DataTypeConstraintEnumerationView", "org/kie/workbench/common/dmn/client/editors/types/listview/constraint/enumeration/DataTypeConstraintEnumerationView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(DataTypeConstraintEnumerationView_HTMLDivElement_items(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "items");
    TemplateUtil.compositeComponentReplace("org.kie.workbench.common.dmn.client.editors.types.listview.constraint.enumeration.DataTypeConstraintEnumerationView", "org/kie/workbench/common/dmn/client/editors/types/listview/constraint/enumeration/DataTypeConstraintEnumerationView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(DataTypeConstraintEnumerationView_HTMLAnchorElement_addIcon(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "add-icon");
    TemplateUtil.compositeComponentReplace("org.kie.workbench.common.dmn.client.editors.types.listview.constraint.enumeration.DataTypeConstraintEnumerationView", "org/kie/workbench/common/dmn/client/editors/types/listview/constraint/enumeration/DataTypeConstraintEnumerationView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(DataTypeConstraintEnumerationView_HTMLDivElement_addButtonContainer(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "add-button-container");
    templateFieldsMap.put("items", ElementWrapperWidget.getWidget(TemplateUtil.asElement(DataTypeConstraintEnumerationView_HTMLDivElement_items(instance))));
    templateFieldsMap.put("add-icon", ElementWrapperWidget.getWidget(TemplateUtil.asElement(DataTypeConstraintEnumerationView_HTMLAnchorElement_addIcon(instance))));
    templateFieldsMap.put("add-button-container", ElementWrapperWidget.getWidget(TemplateUtil.asElement(DataTypeConstraintEnumerationView_HTMLDivElement_addButtonContainer(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfDataTypeConstraintEnumerationView), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("add-icon"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onAddIconClick(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((DataTypeConstraintEnumerationView) instance, contextManager);
  }

  public void destroyInstanceHelper(final DataTypeConstraintEnumerationView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static HTMLDivElement DataTypeConstraintEnumerationView_HTMLDivElement_items(DataTypeConstraintEnumerationView instance) /*-{
    return instance.@org.kie.workbench.common.dmn.client.editors.types.listview.constraint.enumeration.DataTypeConstraintEnumerationView::items;
  }-*/;

  native static void DataTypeConstraintEnumerationView_HTMLDivElement_items(DataTypeConstraintEnumerationView instance, HTMLDivElement value) /*-{
    instance.@org.kie.workbench.common.dmn.client.editors.types.listview.constraint.enumeration.DataTypeConstraintEnumerationView::items = value;
  }-*/;

  native static HTMLDivElement DataTypeConstraintEnumerationView_HTMLDivElement_addButtonContainer(DataTypeConstraintEnumerationView instance) /*-{
    return instance.@org.kie.workbench.common.dmn.client.editors.types.listview.constraint.enumeration.DataTypeConstraintEnumerationView::addButtonContainer;
  }-*/;

  native static void DataTypeConstraintEnumerationView_HTMLDivElement_addButtonContainer(DataTypeConstraintEnumerationView instance, HTMLDivElement value) /*-{
    instance.@org.kie.workbench.common.dmn.client.editors.types.listview.constraint.enumeration.DataTypeConstraintEnumerationView::addButtonContainer = value;
  }-*/;

  native static HTMLAnchorElement DataTypeConstraintEnumerationView_HTMLAnchorElement_addIcon(DataTypeConstraintEnumerationView instance) /*-{
    return instance.@org.kie.workbench.common.dmn.client.editors.types.listview.constraint.enumeration.DataTypeConstraintEnumerationView::addIcon;
  }-*/;

  native static void DataTypeConstraintEnumerationView_HTMLAnchorElement_addIcon(DataTypeConstraintEnumerationView instance, HTMLAnchorElement value) /*-{
    instance.@org.kie.workbench.common.dmn.client.editors.types.listview.constraint.enumeration.DataTypeConstraintEnumerationView::addIcon = value;
  }-*/;
}
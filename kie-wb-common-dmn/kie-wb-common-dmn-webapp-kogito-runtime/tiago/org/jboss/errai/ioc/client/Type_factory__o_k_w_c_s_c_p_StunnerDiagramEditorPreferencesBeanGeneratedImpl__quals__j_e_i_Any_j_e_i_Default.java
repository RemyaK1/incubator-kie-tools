package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.kie.workbench.common.kogito.webapp.base.shared.PreferenceScopeResolutionStrategyMock;
import org.kie.workbench.common.stunner.core.preferences.StunnerDiagramEditorPreferences;
import org.kie.workbench.common.stunner.core.preferences.StunnerDiagramEditorPreferencesBeanGeneratedImpl;
import org.uberfire.preferences.client.store.PreferenceBeanStoreClientImpl;
import org.uberfire.preferences.shared.PreferenceScopeResolutionStrategy;
import org.uberfire.preferences.shared.bean.BasePreference;
import org.uberfire.preferences.shared.bean.BasePreferenceBean;
import org.uberfire.preferences.shared.bean.Preference;
import org.uberfire.preferences.shared.bean.PreferenceBeanStore;

public class Type_factory__o_k_w_c_s_c_p_StunnerDiagramEditorPreferencesBeanGeneratedImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<StunnerDiagramEditorPreferencesBeanGeneratedImpl> { public Type_factory__o_k_w_c_s_c_p_StunnerDiagramEditorPreferencesBeanGeneratedImpl__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(StunnerDiagramEditorPreferencesBeanGeneratedImpl.class, "Type_factory__o_k_w_c_s_c_p_StunnerDiagramEditorPreferencesBeanGeneratedImpl__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { StunnerDiagramEditorPreferencesBeanGeneratedImpl.class, StunnerDiagramEditorPreferences.class, Object.class, BasePreference.class, Preference.class, Cloneable.class, BasePreferenceBean.class });
  }

  public StunnerDiagramEditorPreferencesBeanGeneratedImpl createInstance(final ContextManager contextManager) {
    final PreferenceScopeResolutionStrategy _resolutionStrategy_1 = (PreferenceScopeResolutionStrategyMock) contextManager.getInstance("Type_factory__o_k_w_c_k_w_b_s_PreferenceScopeResolutionStrategyMock__quals__j_e_i_Any_o_u_a_Customizable");
    final PreferenceBeanStore _store_0 = (PreferenceBeanStoreClientImpl) contextManager.getInstance("Type_factory__o_u_p_c_s_PreferenceBeanStoreClientImpl__quals__j_e_i_Any_j_e_i_Default");
    final StunnerDiagramEditorPreferencesBeanGeneratedImpl instance = new StunnerDiagramEditorPreferencesBeanGeneratedImpl(_store_0, _resolutionStrategy_1);
    registerDependentScopedReference(instance, _resolutionStrategy_1);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}
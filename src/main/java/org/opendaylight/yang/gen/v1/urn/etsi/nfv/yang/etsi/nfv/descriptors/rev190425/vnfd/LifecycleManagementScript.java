package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.InternalLifecycleManagementScriptEvent;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.lifecycle.management.script.ScriptInput;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.lifecycle.management.script.ScriptInputKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Includes a list of events and corresponding management scripts performed for 
 * VNF.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list lifecycle-management-script {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf-list event {
 *     type internal-lifecycle-management-script-event;
 *   }
 *   leaf-list lcm-transition-event {
 *     type string;
 *   }
 *   leaf script {
 *     type string;
 *   }
 *   leaf script-dsl {
 *     type string;
 *   }
 *   list script-input {
 *     key key;
 *     leaf key {
 *       type string;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/lifecycle-management-script</i>
 * 
 * <p>To create instances of this class use {@link LifecycleManagementScriptBuilder}.
 * @see LifecycleManagementScriptBuilder
 * @see LifecycleManagementScriptKey
 *
 */
public interface LifecycleManagementScript
    extends
    ChildOf<Vnfd>,
    Augmentable<LifecycleManagementScript>,
    Identifiable<LifecycleManagementScriptKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("lifecycle-management-script");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.LifecycleManagementScript> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.LifecycleManagementScript.class;
    }
    
    /**
     * A unique string that identfies the script in question.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Describes VNF lifecycle event(s) or an external stimulus detected on a VNFM
     * reference point.
     *
     *
     *
     * @return <code>java.util.List</code> <code>event</code>, or <code>null</code> if not present
     */
    @Nullable List<InternalLifecycleManagementScriptEvent> getEvent();
    
    /**
     * Describes the transition VNF lifecycle event(s) that cannot be mapped to any of
     * the enumerated values defined for the event attribute.
     *
     *
     *
     * @return <code>java.util.List</code> <code>lcmTransitionEvent</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getLcmTransitionEvent();
    
    /**
     * Includes a VNF LCM script (e.g. written in a DSL as specified in requirement
     * VNF_PACK.LCM.001) triggered to react to one of the events listed in the event
     * attribute.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>script</code>, or <code>null</code> if not present
     */
    @Nullable String getScript();
    
    /**
     * Defines the domain specific language (i.e. the type) of script that is provided.
     * Types of scripts could include bash, python, etc.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>scriptDsl</code>, or <code>null</code> if not present
     */
    @Nullable String getScriptDsl();
    
    /**
     * Array of KVP requirements with the key as the parameter name and the value as
     * the parameter that need to be passed as an input to the script.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>scriptInput</code>, or <code>null</code> if not present
     */
    @Nullable Map<ScriptInputKey, ScriptInput> getScriptInput();
    
    /**
     * @return <code>java.util.Map</code> <code>scriptInput</code>, or an empty list if it is not present
     */
    default @NonNull Map<ScriptInputKey, ScriptInput> nonnullScriptInput() {
        return CodeHelpers.nonnull(getScriptInput());
    }
    
    @Override
    LifecycleManagementScriptKey key();

}


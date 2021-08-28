package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.lifecycle.management.script;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.LifecycleManagementScript;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Array of KVP requirements with the key as the parameter name and the value as 
 * the parameter that need to be passed as an input to the script.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list script-input {
 *   key key;
 *   leaf key {
 *     type string;
 *   }
 *   leaf value {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/lifecycle-management-script/script-input</i>
 * 
 * <p>To create instances of this class use {@link ScriptInputBuilder}.
 * @see ScriptInputBuilder
 * @see ScriptInputKey
 *
 */
public interface ScriptInput
    extends
    ChildOf<LifecycleManagementScript>,
    Augmentable<ScriptInput>,
    Identifiable<ScriptInputKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("script-input");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.lifecycle.management.script.ScriptInput> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.lifecycle.management.script.ScriptInput.class;
    }
    
    /**
     * Includes a VNF LCM script (e.g. written in a DSL as specified in requirement
     * VNF_PACK.LCM.001) triggered to react to one of the events listed in the event
     * attribute. The string value specified here is a path to a file in the VNF
     * package.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>key</code>, or <code>null</code> if not present
     */
    @Nullable String getKey();
    
    /**
     * @return <code>java.lang.String</code> <code>value</code>, or <code>null</code> if not present
     */
    @Nullable String getValue();
    
    @Override
    ScriptInputKey key();

}


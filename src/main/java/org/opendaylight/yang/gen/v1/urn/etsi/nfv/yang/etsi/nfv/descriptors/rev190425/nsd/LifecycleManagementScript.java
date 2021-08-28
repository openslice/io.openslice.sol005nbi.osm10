package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list lifecycle-management-script {
 *   key event;
 *   leaf event {
 *     type string;
 *   }
 *   leaf script {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/lifecycle-management-script</i>
 * 
 * <p>To create instances of this class use {@link LifecycleManagementScriptBuilder}.
 * @see LifecycleManagementScriptBuilder
 * @see LifecycleManagementScriptKey
 *
 */
public interface LifecycleManagementScript
    extends
    ChildOf<Nsd>,
    Augmentable<LifecycleManagementScript>,
    Identifiable<LifecycleManagementScriptKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("lifecycle-management-script");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.LifecycleManagementScript> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.LifecycleManagementScript.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>event</code>, or <code>null</code> if not present
     */
    @Nullable String getEvent();
    
    /**
     * @return <code>java.lang.String</code> <code>script</code>, or <code>null</code> if not present
     */
    @Nullable String getScript();
    
    @Override
    LifecycleManagementScriptKey key();

}


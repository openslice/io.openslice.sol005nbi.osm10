package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.instantiation.level;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.InstantiationLevel;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint16;

/**
 * Sets the number of instances for the VDU in this instantiation level.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list vdu-level {
 *   key vdu-id;
 *   min-elements 1;
 *   leaf vdu-id {
 *     type leafref {
 *       path ../../../../vdu/id;
 *     }
 *   }
 *   leaf number-of-instances {
 *     type uint16;
 *     must ". &lt;= ../../../../df/vdu-profile[id=current()/../vdu-id]/max-number-of-instances";
 *     must ". &gt;= ../../../../df/vdu-profile[id=current()/../vdu-id]/min-number-of-instances";
 *     default 1;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/df/instantiation-level/vdu-level</i>
 * 
 * <p>To create instances of this class use {@link VduLevelBuilder}.
 * @see VduLevelBuilder
 * @see VduLevelKey
 *
 */
public interface VduLevel
    extends
    ChildOf<InstantiationLevel>,
    Augmentable<VduLevel>,
    Identifiable<VduLevelKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-level");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.instantiation.level.VduLevel> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.instantiation.level.VduLevel.class;
    }
    
    /**
     * Uniquely identifies a VDU.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vduId</code>, or <code>null</code> if not present
     */
    @Nullable String getVduId();
    
    /**
     * Number of instances of VNFC based on this VDU to deploy for this level.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint16</code> <code>numberOfInstances</code>, or <code>null</code> if not present
     */
    @Nullable Uint16 getNumberOfInstances();
    
    @Override
    VduLevelKey key();

}


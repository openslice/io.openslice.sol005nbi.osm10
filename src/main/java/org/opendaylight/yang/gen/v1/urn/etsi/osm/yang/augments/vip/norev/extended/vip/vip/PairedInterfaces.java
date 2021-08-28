package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.vip.norev.extended.vip.vip;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.vip.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.vip.norev.extended.vip.Vip;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vip</b>
 * <pre>
 * list paired-interfaces {
 *   key vdu-id-ref;
 *   leaf vdu-id-ref {
 *     type leafref {
 *       path /vnfd:vnfd/vnfd:vdu/vnfd:id;
 *     }
 *   }
 *   leaf interface-ref {
 *     type leafref {
 *       path /vnfd:vnfd/vnfd:vdu/vnfd:int-cpd/vnfd:virtual-network-interface-requirement/vnfd:name;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vip/extended-vip/vip/paired-interfaces</i>
 * 
 * <p>To create instances of this class use {@link PairedInterfacesBuilder}.
 * @see PairedInterfacesBuilder
 * @see PairedInterfacesKey
 *
 */
public interface PairedInterfaces
    extends
    ChildOf<Vip>,
    Augmentable<PairedInterfaces>,
    Identifiable<PairedInterfacesKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("paired-interfaces");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.vip.norev.extended.vip.vip.PairedInterfaces> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.vip.norev.extended.vip.vip.PairedInterfaces.class;
    }
    
    /**
     * Reference to the VDU
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vduIdRef</code>, or <code>null</code> if not present
     */
    @Nullable String getVduIdRef();
    
    /**
     * Reference to the interface
     *
     *
     *
     * @return <code>java.lang.String</code> <code>interfaceRef</code>, or <code>null</code> if not present
     */
    @Nullable String getInterfaceRef();
    
    @Override
    PairedInterfacesKey key();

}


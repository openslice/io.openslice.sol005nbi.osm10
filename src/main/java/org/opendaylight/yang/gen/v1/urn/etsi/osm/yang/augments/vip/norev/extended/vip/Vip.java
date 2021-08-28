package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.vip.norev.extended.vip;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.vip.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.vip.norev.ExtendedVip;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.vip.norev.extended.vip.vip.PairedInterfaces;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.vip.norev.extended.vip.vip.PairedInterfacesKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Paired interfaces from different VDUs that share a Virtual IP
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vip</b>
 * <pre>
 * list vip {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   list paired-interfaces {
 *     key vdu-id-ref;
 *     leaf vdu-id-ref {
 *       type leafref {
 *         path /vnfd:vnfd/vnfd:vdu/vnfd:id;
 *       }
 *     }
 *     leaf interface-ref {
 *       type leafref {
 *         path /vnfd:vnfd/vnfd:vdu/vnfd:int-cpd/vnfd:virtual-network-interface-requirement/vnfd:name;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vip/extended-vip/vip</i>
 * 
 * <p>To create instances of this class use {@link VipBuilder}.
 * @see VipBuilder
 * @see VipKey
 *
 */
public interface Vip
    extends
    ChildOf<ExtendedVip>,
    Augmentable<Vip>,
    Identifiable<VipKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vip");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.vip.norev.extended.vip.Vip> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.vip.norev.extended.vip.Vip.class;
    }
    
    /**
     * Name of the Virtual IP
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * @return <code>java.util.Map</code> <code>pairedInterfaces</code>, or <code>null</code> if not present
     */
    @Nullable Map<PairedInterfacesKey, PairedInterfaces> getPairedInterfaces();
    
    /**
     * @return <code>java.util.Map</code> <code>pairedInterfaces</code>, or an empty list if it is not present
     */
    default @NonNull Map<PairedInterfacesKey, PairedInterfaces> nonnullPairedInterfaces() {
        return CodeHelpers.nonnull(getPairedInterfaces());
    }
    
    @Override
    VipKey key();

}


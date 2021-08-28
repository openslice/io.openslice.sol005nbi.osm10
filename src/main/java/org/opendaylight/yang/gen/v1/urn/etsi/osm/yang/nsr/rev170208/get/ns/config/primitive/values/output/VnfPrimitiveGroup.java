package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.get.ns.config.primitive.values.output;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.GetNsConfigPrimitiveValuesOutput;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.get.ns.config.primitive.values.output.vnf.primitive.group.Primitive;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.get.ns.config.primitive.values.output.vnf.primitive.group.PrimitiveKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of service primitives grouped by VNF.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vnf-primitive-group {
 *   key member-vnf-index-ref;
 *   leaf member-vnf-index-ref {
 *     type string;
 *   }
 *   leaf vnfd-id-ref {
 *     type string;
 *   }
 *   list primitive {
 *     key index;
 *     leaf index {
 *       type uint32;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     list parameter {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/get-ns-config-primitive-values/output/vnf-primitive-group</i>
 * 
 * <p>To create instances of this class use {@link VnfPrimitiveGroupBuilder}.
 * @see VnfPrimitiveGroupBuilder
 * @see VnfPrimitiveGroupKey
 *
 */
public interface VnfPrimitiveGroup
    extends
    ChildOf<GetNsConfigPrimitiveValuesOutput>,
    Augmentable<VnfPrimitiveGroup>,
    Identifiable<VnfPrimitiveGroupKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-primitive-group");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.get.ns.config.primitive.values.output.VnfPrimitiveGroup> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.get.ns.config.primitive.values.output.VnfPrimitiveGroup.class;
    }
    
    /**
     * Reference to member-vnf within constituent-vnfds
     *
     *
     *
     * @return <code>java.lang.String</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    @Nullable String getMemberVnfIndexRef();
    
    /**
     * A reference to a vnfd. This is a leafref to path:
     * ../../../../project-nsd:constituent-vnfd + [project-nsd:id =
     * current()/../project-nsd:id-ref] + /project-nsd:vnfd-id-ref NOTE: An issue with
     * confd is preventing the use of xpath. Seems to be an issue with leafref to
     * leafref, whose target is in a different module. Once that is resolved this will
     * switched to use leafref
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable String getVnfdIdRef();
    
    /**
     * @return <code>java.util.Map</code> <code>primitive</code>, or <code>null</code> if not present
     */
    @Nullable Map<PrimitiveKey, Primitive> getPrimitive();
    
    /**
     * @return <code>java.util.Map</code> <code>primitive</code>, or an empty list if it is not present
     */
    default @NonNull Map<PrimitiveKey, Primitive> nonnullPrimitive() {
        return CodeHelpers.nonnull(getPrimitive());
    }
    
    @Override
    VnfPrimitiveGroupKey key();

}


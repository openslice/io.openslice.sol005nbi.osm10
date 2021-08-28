package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.output;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ExecNsConfigPrimitiveOutput;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.output.vnf.out.list.VnfOutPrimitive;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.output.vnf.out.list.VnfOutPrimitiveKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * List of VNFs whose primitives were set.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vnf-out-list {
 *   key member_vnf_index_ref;
 *   leaf member_vnf_index_ref {
 *     type uint64;
 *   }
 *   leaf vnfr-id-ref {
 *     type yang:uuid;
 *   }
 *   list vnf-out-primitive {
 *     key index;
 *     leaf index {
 *       type uint32;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     uses manotypes:primitive-parameter-value;
 *     leaf execution-id {
 *       type string;
 *     }
 *     leaf execution-status {
 *       type string;
 *     }
 *     leaf execution-error-details {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-ns-config-primitive/output/vnf-out-list</i>
 * 
 * <p>To create instances of this class use {@link VnfOutListBuilder}.
 * @see VnfOutListBuilder
 * @see VnfOutListKey
 *
 */
public interface VnfOutList
    extends
    ChildOf<ExecNsConfigPrimitiveOutput>,
    Augmentable<VnfOutList>,
    Identifiable<VnfOutListKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-out-list");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.output.VnfOutList> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.output.VnfOutList.class;
    }
    
    /**
     * Member VNF index
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getMemberVnfIndexRef();
    
    /**
     * A reference to a vnfr. This is a leafref to path
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>vnfrIdRef</code>, or <code>null</code> if not present
     */
    @Nullable Uuid getVnfrIdRef();
    
    /**
     * List of service primitives supported by the configuration agent for this VNF.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vnfOutPrimitive</code>, or <code>null</code> if not present
     */
    @Nullable Map<VnfOutPrimitiveKey, VnfOutPrimitive> getVnfOutPrimitive();
    
    /**
     * @return <code>java.util.Map</code> <code>vnfOutPrimitive</code>, or an empty list if it is not present
     */
    default @NonNull Map<VnfOutPrimitiveKey, VnfOutPrimitive> nonnullVnfOutPrimitive() {
        return CodeHelpers.nonnull(getVnfOutPrimitive());
    }
    
    @Override
    VnfOutListKey key();

}


package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.output.ParameterGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.output.ParameterGroupKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.output.VnfOutList;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.output.VnfOutListKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.RpcOutput;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint32;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * output output {
 *   leaf job-id {
 *     type uint64;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   uses rpc-common;
 *   leaf triggered-by {
 *     type trigger-type;
 *   }
 *   leaf create-time {
 *     type uint32;
 *   }
 *   leaf job-status-details {
 *     type string;
 *   }
 *   uses manotypes:primitive-parameter-value;
 *   list parameter-group {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     uses manotypes:primitive-parameter-value;
 *   }
 *   list vnf-out-list {
 *     key member_vnf_index_ref;
 *     leaf member_vnf_index_ref {
 *       type uint64;
 *     }
 *     leaf vnfr-id-ref {
 *       type yang:uuid;
 *     }
 *     list vnf-out-primitive {
 *       key index;
 *       leaf index {
 *         type uint32;
 *       }
 *       leaf name {
 *         type string;
 *       }
 *       uses manotypes:primitive-parameter-value;
 *       leaf execution-id {
 *         type string;
 *       }
 *       leaf execution-status {
 *         type string;
 *       }
 *       leaf execution-error-details {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-ns-config-primitive/output</i>
 * 
 * <p>To create instances of this class use {@link ExecNsConfigPrimitiveOutputBuilder}.
 * @see ExecNsConfigPrimitiveOutputBuilder
 *
 */
public interface ExecNsConfigPrimitiveOutput
    extends
    RpcCommon,
    PrimitiveParameterValue,
    RpcOutput,
    Augmentable<ExecNsConfigPrimitiveOutput>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("output");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ExecNsConfigPrimitiveOutput> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ExecNsConfigPrimitiveOutput.class;
    }
    
    /**
     * Job identifier for this RPC
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>jobId</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getJobId();
    
    /**
     * Name of the service primitive
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * The primitive is triggered from NS or VNF level
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.TriggerType</code> <code>triggeredBy</code>, or <code>null</code> if not present
     */
    @Nullable TriggerType getTriggeredBy();
    
    /**
     * Creation timestamp of this config agent JOB. The timestamp is expressed as
     * seconds since unix epoch - 1970-01-01T00:00:00Z
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>createTime</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getCreateTime();
    
    /**
     * Job status details, in case of any errors
     *
     *
     *
     * @return <code>java.lang.String</code> <code>jobStatusDetails</code>, or <code>null</code> if not present
     */
    @Nullable String getJobStatusDetails();
    
    /**
     * List of NS Primitive parameter groups
     *
     *
     *
     * @return <code>java.util.Map</code> <code>parameterGroup</code>, or <code>null</code> if not present
     */
    @Nullable Map<ParameterGroupKey, ParameterGroup> getParameterGroup();
    
    /**
     * @return <code>java.util.Map</code> <code>parameterGroup</code>, or an empty list if it is not present
     */
    default @NonNull Map<ParameterGroupKey, ParameterGroup> nonnullParameterGroup() {
        return CodeHelpers.nonnull(getParameterGroup());
    }
    
    /**
     * List of VNFs whose primitives were set.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vnfOutList</code>, or <code>null</code> if not present
     */
    @Nullable Map<VnfOutListKey, VnfOutList> getVnfOutList();
    
    /**
     * @return <code>java.util.Map</code> <code>vnfOutList</code>, or an empty list if it is not present
     */
    default @NonNull Map<VnfOutListKey, VnfOutList> nonnullVnfOutList() {
        return CodeHelpers.nonnull(getVnfOutList());
    }

}


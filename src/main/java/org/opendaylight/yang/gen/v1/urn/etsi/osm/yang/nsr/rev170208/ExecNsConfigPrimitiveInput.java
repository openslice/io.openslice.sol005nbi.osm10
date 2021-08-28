package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.input.ParameterGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.input.ParameterGroupKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.input.VnfList;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.input.VnfListKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.RpcInput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * input input {
 *   leaf name {
 *     type string;
 *   }
 *   uses rpc-common;
 *   leaf triggered-by {
 *     type trigger-type;
 *     default ns-primitive;
 *   }
 *   uses manotypes:primitive-parameter-value;
 *   list parameter-group {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     uses manotypes:primitive-parameter-value;
 *   }
 *   list vnf-list {
 *     key member_vnf_index_ref;
 *     leaf member_vnf_index_ref {
 *       type uint64;
 *     }
 *     leaf vnfr-id-ref {
 *       type yang:uuid;
 *     }
 *     list vnf-primitive {
 *       key index;
 *       leaf index {
 *         type uint32;
 *       }
 *       leaf name {
 *         type string;
 *       }
 *       uses manotypes:primitive-parameter-value;
 *     }
 *   }
 *   leaf user-defined-script {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-ns-config-primitive/input</i>
 * 
 * <p>To create instances of this class use {@link ExecNsConfigPrimitiveInputBuilder}.
 * @see ExecNsConfigPrimitiveInputBuilder
 *
 */
public interface ExecNsConfigPrimitiveInput
    extends
    RpcCommon,
    PrimitiveParameterValue,
    RpcInput,
    Augmentable<ExecNsConfigPrimitiveInput>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ExecNsConfigPrimitiveInput> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ExecNsConfigPrimitiveInput.class;
    }
    
    /**
     * Name of the primitive
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
     * List of VNFs whose primitives are being set.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vnfList</code>, or <code>null</code> if not present
     */
    @Nullable Map<VnfListKey, VnfList> getVnfList();
    
    /**
     * @return <code>java.util.Map</code> <code>vnfList</code>, or an empty list if it is not present
     */
    default @NonNull Map<VnfListKey, VnfList> nonnullVnfList() {
        return CodeHelpers.nonnull(getVnfList());
    }
    
    /**
     * A user defined script.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>userDefinedScript</code>, or <code>null</code> if not present
     */
    @Nullable String getUserDefinedScript();

}


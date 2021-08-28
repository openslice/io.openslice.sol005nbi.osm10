package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import com.google.common.util.concurrent.ListenableFuture;
import edu.umd.cs.findbugs.annotations.CheckReturnValue;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;

/**
 * Interface for implementing the following YANG RPCs defined in module <b>nsr</b>
 * <pre>
 * rpc get-ns-config-primitive-values {
 *   input input {
 *     leaf name {
 *       type string;
 *     }
 *     uses rpc-common;
 *   }
 *   output output {
 *     list ns-parameter {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *     list ns-parameter-group {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       list parameter {
 *         key name;
 *         leaf name {
 *           type string;
 *         }
 *         leaf value {
 *           type string;
 *         }
 *       }
 *     }
 *     list vnf-primitive-group {
 *       key member-vnf-index-ref;
 *       leaf member-vnf-index-ref {
 *         type string;
 *       }
 *       leaf vnfd-id-ref {
 *         type string;
 *       }
 *       list primitive {
 *         key index;
 *         leaf index {
 *           type uint32;
 *         }
 *         leaf name {
 *           type string;
 *         }
 *         list parameter {
 *           key name;
 *           leaf name {
 *             type string;
 *           }
 *           leaf value {
 *             type string;
 *           }
 *         }
 *       }
 *     }
 *   }
 * }
 * rpc exec-ns-config-primitive {
 *   input input {
 *     leaf name {
 *       type string;
 *     }
 *     uses rpc-common;
 *     leaf triggered-by {
 *       type trigger-type;
 *       default ns-primitive;
 *     }
 *     uses manotypes:primitive-parameter-value;
 *     list parameter-group {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       uses manotypes:primitive-parameter-value;
 *     }
 *     list vnf-list {
 *       key member_vnf_index_ref;
 *       leaf member_vnf_index_ref {
 *         type uint64;
 *       }
 *       leaf vnfr-id-ref {
 *         type yang:uuid;
 *       }
 *       list vnf-primitive {
 *         key index;
 *         leaf index {
 *           type uint32;
 *         }
 *         leaf name {
 *           type string;
 *         }
 *         uses manotypes:primitive-parameter-value;
 *       }
 *     }
 *     leaf user-defined-script {
 *       type string;
 *     }
 *   }
 *   output output {
 *     leaf job-id {
 *       type uint64;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     uses rpc-common;
 *     leaf triggered-by {
 *       type trigger-type;
 *     }
 *     leaf create-time {
 *       type uint32;
 *     }
 *     leaf job-status-details {
 *       type string;
 *     }
 *     uses manotypes:primitive-parameter-value;
 *     list parameter-group {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       uses manotypes:primitive-parameter-value;
 *     }
 *     list vnf-out-list {
 *       key member_vnf_index_ref;
 *       leaf member_vnf_index_ref {
 *         type uint64;
 *       }
 *       leaf vnfr-id-ref {
 *         type yang:uuid;
 *       }
 *       list vnf-out-primitive {
 *         key index;
 *         leaf index {
 *           type uint32;
 *         }
 *         leaf name {
 *           type string;
 *         }
 *         uses manotypes:primitive-parameter-value;
 *         leaf execution-id {
 *           type string;
 *         }
 *         leaf execution-status {
 *           type string;
 *         }
 *         leaf execution-error-details {
 *           type string;
 *         }
 *       }
 *     }
 *   }
 * }
 * rpc exec-scale-in {
 *   input input {
 *     uses rpc-common;
 *     leaf scaling-group-name-ref {
 *       type leafref {
 *         path /osm-project:project[osm-project:name=current()/../nsr:project-name]/nsr:ns-instance-config/nsr:nsr[nsr:id=current()/../nsr:nsr_id_ref]/nsr:nsd/nsr:scaling-group-descriptor/nsr:name;
 *       }
 *     }
 *     leaf instance-id {
 *       type leafref {
 *         path /osm-project:project[osm-project:name=current()/../nsr:project-name]/nsr:ns-instance-config/nsr:nsr[nsr:id=current()/../nsr:nsr_id_ref]/nsr:scaling-group[nsr:scaling-group-name-ref=current()/../nsr:scaling-group-name-ref]/nsr:instance/nsr:id;
 *       }
 *     }
 *   }
 *   output output {
 *     leaf instance-id {
 *       type uint64;
 *     }
 *   }
 * }
 * rpc exec-scale-out {
 *   input input {
 *     uses rpc-common;
 *     leaf scaling-group-name-ref {
 *       type leafref {
 *         path /osm-project:project[osm-project:name=current()/../nsr:project-name]/nsr:ns-instance-config/nsr:nsr[nsr:id=current()/../nsr:nsr_id_ref]/nsr:nsd/nsr:scaling-group-descriptor/nsr:name;
 *       }
 *     }
 *     leaf instance-id {
 *       type uint64;
 *     }
 *   }
 *   output output {
 *     leaf instance-id {
 *       type uint64;
 *     }
 *   }
 * }
 * rpc start-network-service {
 *   input input {
 *     leaf name {
 *       type string;
 *     }
 *     uses manotypes:rpc-project-name;
 *     leaf nsd_id_ref {
 *       type leafref {
 *         path /osm-project:project[osm-project:name=current()/../project-name]/project-nsd:nsd-catalog/project-nsd:nsd/project-nsd:id;
 *       }
 *     }
 *     uses ns-instance-config-params-common;
 *     list vnfd-placement-group-maps {
 *       key "placement-group-ref vnfd-id-ref";
 *       leaf vnfd-id-ref {
 *         type yang:uuid;
 *       }
 *       leaf placement-group-ref {
 *         type leafref {
 *           path "/osm-project:project[osm-project:name=current()/../../project-name]/project-vnfd:vnfd-catalog/project-vnfd:vnfd[project-vnfd:id = current()/../vnfd-id-ref]/project-vnfd:placement-groups/project-vnfd:name";
 *         }
 *       }
 *       uses manotypes:placement-group-input;
 *       list ssh-authorized-key {
 *         key key-pair-ref;
 *         leaf key-pair-ref {
 *           type leafref {
 *             path /osm-project:project[osm-project:name=current()/../../../project-name]/key-pair/name;
 *           }
 *         }
 *       }
 *       list user {
 *         key name;
 *         leaf name {
 *           type string;
 *         }
 *         leaf user-info {
 *           type string;
 *         }
 *         list ssh-authorized-key {
 *           key key-pair-ref;
 *           leaf key-pair-ref {
 *             type leafref {
 *               path /osm-project:project[osm-project:name=current()/../../../../project-name]/key-pair/name;
 *             }
 *           }
 *         }
 *       }
 *     }
 *   }
 *   output output {
 *     leaf nsr-id {
 *       type yang:uuid;
 *     }
 *   }
 * }
 * </pre>
 *
 */
public interface NsrService
    extends
    RpcService
{




    /**
     * Get the config primitive parameter values
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<GetNsConfigPrimitiveValuesOutput>> getNsConfigPrimitiveValues(GetNsConfigPrimitiveValuesInput input);
    
    /**
     * Executes a NS config primitive or script
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<ExecNsConfigPrimitiveOutput>> execNsConfigPrimitive(ExecNsConfigPrimitiveInput input);
    
    /**
     * Executes scale out request
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<ExecScaleInOutput>> execScaleIn(ExecScaleInInput input);
    
    /**
     * Executes scale out request
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<ExecScaleOutOutput>> execScaleOut(ExecScaleOutInput input);
    
    /**
     * Start the network service
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<StartNetworkServiceOutput>> startNetworkService(StartNetworkServiceInput input);

}


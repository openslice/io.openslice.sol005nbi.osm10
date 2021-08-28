package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * module nst {
 *   yang-version 1;
 *   namespace urn:etsi:osm:yang:nst;
 *   prefix nst;
 *   import nsd-base {
 *     prefix nsd-base;
 *   }
 *   import nsd {
 *     prefix nsd;
 *   }
 *   import instantiation-parameters {
 *     prefix instantiation-parameters;
 *   }
 *   import ietf-inet-types {
 *     prefix inet;
 *   }
 *   revision 2018-08-20 {
 *   }
 *   typedef connection-points {
 *     type string;
 *   }
 *   typedef network-slice-type {
 *     type enumeration {
 *       enum eMBB {
 *       }
 *       enum URLLC {
 *       }
 *       enum mMTC {
 *       }
 *     }
 *   }
 *   typedef resource-type {
 *     type enumeration {
 *       enum delay-critical-GBR {
 *       }
 *       enum GBR {
 *       }
 *       enum non-GBR {
 *       }
 *     }
 *   }
 *   grouping nsvld {
 *     uses nsd-base:vld-common;
 *     list nss-connection-point-ref {
 *       key "nss-ref nsd-connection-point-ref";
 *       leaf nss-ref {
 *         type leafref {
 *           path /nst:nst/nst:netslice-subnet/nst:id;
 *         }
 *       }
 *       leaf nsd-connection-point-ref {
 *         type leafref {
 *           path /nsd:nsd-catalog/nsd:nsd/nsd:connection-point/nsd:name;
 *         }
 *       }
 *       leaf ip-address {
 *         type inet:ip-address;
 *       }
 *     }
 *   }
 *   grouping snssai {
 *     leaf slice-service-type {
 *       type network-slice-type;
 *     }
 *     leaf slice-differentiator {
 *       type string;
 *     }
 *   }
 *   grouping five-qi {
 *     leaf id {
 *       type uint16;
 *     }
 *     leaf resource-type {
 *       type resource-type;
 *     }
 *     leaf priority-level {
 *       type uint16;
 *     }
 *     leaf packet-delay-budget {
 *       type uint16;
 *     }
 *     leaf packet-error-rate {
 *       type uint16;
 *     }
 *     leaf default-max-data-burst {
 *       type uint16;
 *     }
 *   }
 *   grouping netslice-subnet {
 *     leaf id {
 *       type string {
 *         length 1..63;
 *       }
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     leaf is-shared-nss {
 *       type boolean;
 *       default false;
 *     }
 *     leaf nsd-ref {
 *       type leafref {
 *         path /nsd:nsd-catalog/nsd:nsd/nsd:id;
 *       }
 *     }
 *     container instantiation-parameters {
 *       uses instantiation-parameters:ns_params;
 *     }
 *   }
 *   grouping slice-connection-points {
 *     uses nsd-base:nsd-connection-point-common;
 *     choice connection {
 *       case netslice-vld-ref {
 *         leaf netslice-vld-id-ref {
 *           type leafref {
 *             path ../../netslice-vld/id;
 *           }
 *         }
 *       }
 *       case nsd-connection-point-ref {
 *         leaf nsd-id-ref {
 *           type leafref {
 *             path /nsd:nsd-catalog/nsd:nsd/nsd:id;
 *           }
 *         }
 *         leaf nsd-connection-point-ref {
 *           type leafref {
 *             path /nsd:nsd-catalog/nsd:nsd/nsd:connection-point/nsd:name;
 *           }
 *         }
 *       }
 *     }
 *   }
 *   grouping rsp {
 *     uses nsd-base:rsp-common;
 *     list nsd-connection-point-ref {
 *       key nsd-ref;
 *       leaf nsd-ref {
 *         type leafref {
 *           path /nsd:nsd-catalog/nsd:nsd/nsd:id;
 *         }
 *       }
 *       leaf order {
 *         type uint8;
 *       }
 *       leaf nsd-connection-point-ref {
 *         type leafref {
 *           path /nsd:nsd-catalog/nsd:nsd/nsd:connection-point/nsd:name;
 *         }
 *       }
 *     }
 *   }
 *   grouping classifier {
 *     uses nsd-base:classifier-common;
 *     leaf nsd-ref {
 *       type leafref {
 *         path /nsd:nsd-catalog/nsd:nsd/nsd:id;
 *       }
 *     }
 *     leaf nsd-connection-point-ref {
 *       type leafref {
 *         path /nsd:nsd-catalog/nsd:nsd/nsd:connection-point/nsd:name;
 *       }
 *     }
 *   }
 *   grouping netslicefgd {
 *     uses nsd-base:fgd-common;
 *     list rsp {
 *       key id;
 *       uses rsp;
 *     }
 *     list classifier {
 *       key id;
 *       uses classifier;
 *     }
 *   }
 *   grouping network-slice {
 *     leaf id {
 *       type string;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     container SNSSAI-identifier {
 *       uses snssai;
 *     }
 *     container quality-of-service {
 *       uses five-qi;
 *     }
 *     list netslice-subnet {
 *       key id;
 *       uses netslice-subnet;
 *     }
 *     list netslice-connection-point {
 *       key name;
 *       uses slice-connection-points;
 *     }
 *     list netslice-vld {
 *       key id;
 *       uses nsvld;
 *     }
 *     list netslicefgd {
 *       key id;
 *       uses netslicefgd;
 *     }
 *   }
 *   list nst {
 *     key id;
 *     uses network-slice;
 *   }
 * }
 * </pre>
 *
 */
public interface NstData
    extends
    DataRoot
{




    /**
     * @return <code>java.util.Map</code> <code>nst</code>, or <code>null</code> if not present
     */
    @Nullable Map<NstKey, Nst> getNst();
    
    /**
     * @return <code>java.util.Map</code> <code>nst</code>, or an empty list if it is not present
     */
    default @NonNull Map<NstKey, Nst> nonnullNst() {
        return CodeHelpers.nonnull(getNst());
    }

}


package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * EPA attributes for the guest
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping guest-epa {
 *   container guest-epa {
 *     leaf trusted-execution {
 *       type boolean;
 *     }
 *     leaf mempage-size {
 *       type enumeration {
 *         enum LARGE;
 *         enum SMALL;
 *         enum SIZE_2MB;
 *         enum SIZE_1GB;
 *         enum PREFER_LARGE;
 *       }
 *     }
 *     choice cpu-policy {
 *       case cpu-pinning {
 *         leaf cpu-pinning-policy {
 *           type enumeration {
 *             enum DEDICATED;
 *             enum SHARED;
 *             enum ANY;
 *           }
 *           default ANY;
 *         }
 *         leaf cpu-thread-pinning-policy {
 *           type enumeration {
 *             enum AVOID;
 *             enum SEPARATE;
 *             enum ISOLATE;
 *             enum PREFER;
 *           }
 *         }
 *       }
 *       case cpu-quota {
 *         container cpu-quota {
 *           uses allocation-properties;
 *         }
 *       }
 *     }
 *     container mem-quota {
 *       uses allocation-properties;
 *     }
 *     container disk-io-quota {
 *       uses allocation-properties;
 *     }
 *     container vif-quota {
 *       uses allocation-properties;
 *     }
 *     list pcie-device {
 *       key device-id;
 *       leaf device-id {
 *         type string;
 *       }
 *       leaf count {
 *         type uint64;
 *       }
 *     }
 *     choice numa-policy {
 *       case numa-unaware {
 *         leaf numa-unaware {
 *           type empty;
 *         }
 *       }
 *       case numa-aware {
 *         container numa-node-policy {
 *           leaf node-cnt {
 *             type uint16;
 *           }
 *           leaf mem-policy {
 *             type enumeration {
 *               enum STRICT;
 *               enum PREFERRED;
 *             }
 *           }
 *           list node {
 *             key id;
 *             leaf id {
 *               type uint64;
 *             }
 *             list vcpu {
 *               key id;
 *               leaf id {
 *                 type uint64;
 *               }
 *             }
 *             leaf memory-mb {
 *               type uint64;
 *             }
 *             choice om-numa-type {
 *               case cores {
 *                 leaf num-cores {
 *                   type uint8;
 *                 }
 *               }
 *               case paired-threads {
 *                 container paired-threads {
 *                   leaf num-paired-threads {
 *                     type uint8;
 *                   }
 *                   list paired-thread-ids {
 *                     max-elements 16;
 *                     key thread-a;
 *                     leaf thread-a {
 *                       type uint8;
 *                     }
 *                     leaf thread-b {
 *                       type uint8;
 *                     }
 *                   }
 *                 }
 *               }
 *               case threads {
 *                 leaf num-threads {
 *                   type uint8;
 *                 }
 *               }
 *             }
 *           }
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa</i>
 *
 */
public interface GuestEpa
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("guest-epa");

    @Override
    Class<? extends GuestEpa> implementedInterface();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.GuestEpa</code> <code>guestEpa</code>, or <code>null</code> if not present
     */
    org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.@Nullable GuestEpa getGuestEpa();

}


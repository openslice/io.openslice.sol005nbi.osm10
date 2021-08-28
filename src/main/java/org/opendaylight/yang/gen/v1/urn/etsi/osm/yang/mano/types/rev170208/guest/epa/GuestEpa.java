package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.CpuPolicy;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.DiskIoQuota;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.MemQuota;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.NumaPolicy;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.PcieDevice;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.PcieDeviceKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.VifQuota;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container guest-epa {
 *   leaf trusted-execution {
 *     type boolean;
 *   }
 *   leaf mempage-size {
 *     type enumeration {
 *       enum LARGE;
 *       enum SMALL;
 *       enum SIZE_2MB;
 *       enum SIZE_1GB;
 *       enum PREFER_LARGE;
 *     }
 *   }
 *   choice cpu-policy {
 *     case cpu-pinning {
 *       leaf cpu-pinning-policy {
 *         type enumeration {
 *           enum DEDICATED;
 *           enum SHARED;
 *           enum ANY;
 *         }
 *         default ANY;
 *       }
 *       leaf cpu-thread-pinning-policy {
 *         type enumeration {
 *           enum AVOID;
 *           enum SEPARATE;
 *           enum ISOLATE;
 *           enum PREFER;
 *         }
 *       }
 *     }
 *     case cpu-quota {
 *       container cpu-quota {
 *         uses allocation-properties;
 *       }
 *     }
 *   }
 *   container mem-quota {
 *     uses allocation-properties;
 *   }
 *   container disk-io-quota {
 *     uses allocation-properties;
 *   }
 *   container vif-quota {
 *     uses allocation-properties;
 *   }
 *   list pcie-device {
 *     key device-id;
 *     leaf device-id {
 *       type string;
 *     }
 *     leaf count {
 *       type uint64;
 *     }
 *   }
 *   choice numa-policy {
 *     case numa-unaware {
 *       leaf numa-unaware {
 *         type empty;
 *       }
 *     }
 *     case numa-aware {
 *       container numa-node-policy {
 *         leaf node-cnt {
 *           type uint16;
 *         }
 *         leaf mem-policy {
 *           type enumeration {
 *             enum STRICT;
 *             enum PREFERRED;
 *           }
 *         }
 *         list node {
 *           key id;
 *           leaf id {
 *             type uint64;
 *           }
 *           list vcpu {
 *             key id;
 *             leaf id {
 *               type uint64;
 *             }
 *           }
 *           leaf memory-mb {
 *             type uint64;
 *           }
 *           choice om-numa-type {
 *             case cores {
 *               leaf num-cores {
 *                 type uint8;
 *               }
 *             }
 *             case paired-threads {
 *               container paired-threads {
 *                 leaf num-paired-threads {
 *                   type uint8;
 *                 }
 *                 list paired-thread-ids {
 *                   max-elements 16;
 *                   key thread-a;
 *                   leaf thread-a {
 *                     type uint8;
 *                   }
 *                   leaf thread-b {
 *                     type uint8;
 *                   }
 *                 }
 *               }
 *             }
 *             case threads {
 *               leaf num-threads {
 *                 type uint8;
 *               }
 *             }
 *           }
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa</i>
 * 
 * <p>To create instances of this class use {@link GuestEpaBuilder}.
 * @see GuestEpaBuilder
 *
 */
public interface GuestEpa
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.GuestEpa>,
    Augmentable<GuestEpa>
{


    public enum MempageSize implements Enumeration {
        LARGE(0, "LARGE"),
        
        SMALL(1, "SMALL"),
        
        SIZE2MB(2, "SIZE_2MB"),
        
        SIZE1GB(3, "SIZE_1GB"),
        
        PREFERLARGE(4, "PREFER_LARGE")
        ;
    
        private static final Map<String, MempageSize> NAME_MAP;
        private static final Map<Integer, MempageSize> VALUE_MAP;
    
        static {
            final Builder<String, MempageSize> nb = ImmutableMap.builder();
            final Builder<Integer, MempageSize> vb = ImmutableMap.builder();
            for (MempageSize enumItem : MempageSize.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private MempageSize(int value, String name) {
            this.value = value;
            this.name = name;
        }
    
        @Override
        public String getName() {
            return name;
        }
    
        @Override
        public int getIntValue() {
            return value;
        }
    
        /**
         * Return the enumeration member whose {@link #getName()} matches specified value.
         *
         * @param name YANG assigned name
         * @return corresponding MempageSize item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<MempageSize> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding MempageSize item, or null if no such item exists
         */
        public static MempageSize forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("guest-epa");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.GuestEpa> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.GuestEpa.class;
    }
    
    /**
     * This VM should be allocated from trusted pool
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>trustedExecution</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isTrustedExecution();
    
    /**
     * Memory page allocation size. If a VM requires hugepages, it should choose LARGE
     * or SIZE_2MB or SIZE_1GB. If the VM prefers hugepages it should choose
     * PREFER_LARGE. LARGE : Require hugepages (either 2MB or 1GB) SMALL : Doesn't
     * require hugepages SIZE_2MB : Requires 2MB hugepages SIZE_1GB : Requires 1GB
     * hugepages PREFER_LARGE : Application prefers hugepages
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.GuestEpa.MempageSize</code> <code>mempageSize</code>, or <code>null</code> if not present
     */
    @Nullable MempageSize getMempageSize();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.CpuPolicy</code> <code>cpuPolicy</code>, or <code>null</code> if not present
     */
    @Nullable CpuPolicy getCpuPolicy();
    
    /**
     * Memory quota describes the memory resource allocation policy. Limit and Reserve
     * values are defined in MB
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.MemQuota</code> <code>memQuota</code>, or <code>null</code> if not present
     */
    @Nullable MemQuota getMemQuota();
    
    /**
     * Disk IO quota describes the disk IO operations resource allocation policy. Limit
     * and Reserve values are defined in IOPS
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.DiskIoQuota</code> <code>diskIoQuota</code>, or <code>null</code> if not present
     */
    @Nullable DiskIoQuota getDiskIoQuota();
    
    /**
     * Virtual interfaces quota describes the virtual interface bandwidth resource
     * allocation policy. Limit and Reserve values are defined in Mbps
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.VifQuota</code> <code>vifQuota</code>, or <code>null</code> if not present
     */
    @Nullable VifQuota getVifQuota();
    
    /**
     * List of pcie passthrough devices.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>pcieDevice</code>, or <code>null</code> if not present
     */
    @Nullable Map<PcieDeviceKey, PcieDevice> getPcieDevice();
    
    /**
     * @return <code>java.util.Map</code> <code>pcieDevice</code>, or an empty list if it is not present
     */
    default @NonNull Map<PcieDeviceKey, PcieDevice> nonnullPcieDevice() {
        return CodeHelpers.nonnull(getPcieDevice());
    }
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.NumaPolicy</code> <code>numaPolicy</code>, or <code>null</code> if not present
     */
    @Nullable NumaPolicy getNumaPolicy();

}


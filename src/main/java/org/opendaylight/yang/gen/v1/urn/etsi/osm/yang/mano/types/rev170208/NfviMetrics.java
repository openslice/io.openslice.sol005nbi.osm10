package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.ExternalPorts;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.InternalPorts;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.Memory;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.Network;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.Storage;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.Vcpu;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping nfvi-metrics {
 *   container vcpu {
 *     leaf label {
 *       type string;
 *       default VCPU;
 *     }
 *     leaf total {
 *       type uint64;
 *     }
 *     leaf utilization {
 *       type decimal64 {
 *         fraction-digits 2;
 *         range "0 .. 100";
 *       }
 *     }
 *   }
 *   container memory {
 *     leaf label {
 *       type string;
 *       default MEMORY;
 *     }
 *     leaf used {
 *       type uint64;
 *     }
 *     leaf total {
 *       type uint64;
 *     }
 *     leaf utilization {
 *       type decimal64 {
 *         fraction-digits 2;
 *         range "0 .. 100";
 *       }
 *     }
 *   }
 *   container storage {
 *     leaf label {
 *       type string;
 *       default STORAGE;
 *     }
 *     leaf used {
 *       type uint64;
 *     }
 *     leaf total {
 *       type uint64;
 *     }
 *     leaf utilization {
 *       type decimal64 {
 *         fraction-digits 2;
 *         range "0 .. 100";
 *       }
 *     }
 *   }
 *   container external-ports {
 *     leaf label {
 *       type string;
 *       default "EXTERNAL PORTS";
 *     }
 *     leaf total {
 *       type uint64;
 *     }
 *   }
 *   container internal-ports {
 *     leaf label {
 *       type string;
 *       default "INTERNAL PORTS";
 *     }
 *     leaf total {
 *       type uint64;
 *     }
 *   }
 *   container network {
 *     leaf label {
 *       type string;
 *       default "NETWORK TRAFFIC";
 *     }
 *     container incoming {
 *       leaf label {
 *         type string;
 *         default "INCOMING NETWORK TRAFFIC";
 *       }
 *       leaf bytes {
 *         type uint64;
 *       }
 *       leaf packets {
 *         type uint64;
 *       }
 *       leaf byte-rate {
 *         type decimal64 {
 *           fraction-digits 2;
 *         }
 *       }
 *       leaf packet-rate {
 *         type decimal64 {
 *           fraction-digits 2;
 *         }
 *       }
 *     }
 *     container outgoing {
 *       leaf label {
 *         type string;
 *         default "OUTGOING NETWORK TRAFFIC";
 *       }
 *       leaf bytes {
 *         type uint64;
 *       }
 *       leaf packets {
 *         type uint64;
 *       }
 *       leaf byte-rate {
 *         type decimal64 {
 *           fraction-digits 2;
 *         }
 *       }
 *       leaf packet-rate {
 *         type decimal64 {
 *           fraction-digits 2;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/nfvi-metrics</i>
 *
 */
public interface NfviMetrics
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nfvi-metrics");

    @Override
    Class<? extends NfviMetrics> implementedInterface();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.Vcpu</code> <code>vcpu</code>, or <code>null</code> if not present
     */
    @Nullable Vcpu getVcpu();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.Memory</code> <code>memory</code>, or <code>null</code> if not present
     */
    @Nullable Memory getMemory();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.Storage</code> <code>storage</code>, or <code>null</code> if not present
     */
    @Nullable Storage getStorage();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.ExternalPorts</code> <code>externalPorts</code>, or <code>null</code> if not present
     */
    @Nullable ExternalPorts getExternalPorts();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.InternalPorts</code> <code>internalPorts</code>, or <code>null</code> if not present
     */
    @Nullable InternalPorts getInternalPorts();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.Network</code> <code>network</code>, or <code>null</code> if not present
     */
    @Nullable Network getNetwork();

}


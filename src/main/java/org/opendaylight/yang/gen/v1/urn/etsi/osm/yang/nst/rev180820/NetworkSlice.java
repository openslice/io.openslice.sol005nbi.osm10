package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetsliceConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetsliceConnectionPointKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetsliceSubnet;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetsliceSubnetKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetsliceVld;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetsliceVldKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.Netslicefgd;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetslicefgdKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.QualityOfService;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.SNSSAIIdentifier;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * grouping network-slice {
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   container SNSSAI-identifier {
 *     uses snssai;
 *   }
 *   container quality-of-service {
 *     uses five-qi;
 *   }
 *   list netslice-subnet {
 *     key id;
 *     uses netslice-subnet;
 *   }
 *   list netslice-connection-point {
 *     key name;
 *     uses slice-connection-points;
 *   }
 *   list netslice-vld {
 *     key id;
 *     uses nsvld;
 *   }
 *   list netslicefgd {
 *     key id;
 *     uses netslicefgd;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/network-slice</i>
 *
 */
public interface NetworkSlice
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("network-slice");

    @Override
    Class<? extends NetworkSlice> implementedInterface();
    
    /**
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.SNSSAIIdentifier</code> <code>sNSSAIIdentifier</code>, or <code>null</code> if not present
     */
    @Nullable SNSSAIIdentifier getSNSSAIIdentifier();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.QualityOfService</code> <code>qualityOfService</code>, or <code>null</code> if not present
     */
    @Nullable QualityOfService getQualityOfService();
    
    /**
     * @return <code>java.util.Map</code> <code>netsliceSubnet</code>, or <code>null</code> if not present
     */
    @Nullable Map<NetsliceSubnetKey, NetsliceSubnet> getNetsliceSubnet();
    
    /**
     * @return <code>java.util.Map</code> <code>netsliceSubnet</code>, or an empty list if it is not present
     */
    default @NonNull Map<NetsliceSubnetKey, NetsliceSubnet> nonnullNetsliceSubnet() {
        return CodeHelpers.nonnull(getNetsliceSubnet());
    }
    
    /**
     * @return <code>java.util.Map</code> <code>netsliceConnectionPoint</code>, or <code>null</code> if not present
     */
    @Nullable Map<NetsliceConnectionPointKey, NetsliceConnectionPoint> getNetsliceConnectionPoint();
    
    /**
     * @return <code>java.util.Map</code> <code>netsliceConnectionPoint</code>, or an empty list if it is not present
     */
    default @NonNull Map<NetsliceConnectionPointKey, NetsliceConnectionPoint> nonnullNetsliceConnectionPoint() {
        return CodeHelpers.nonnull(getNetsliceConnectionPoint());
    }
    
    /**
     * @return <code>java.util.Map</code> <code>netsliceVld</code>, or <code>null</code> if not present
     */
    @Nullable Map<NetsliceVldKey, NetsliceVld> getNetsliceVld();
    
    /**
     * @return <code>java.util.Map</code> <code>netsliceVld</code>, or an empty list if it is not present
     */
    default @NonNull Map<NetsliceVldKey, NetsliceVld> nonnullNetsliceVld() {
        return CodeHelpers.nonnull(getNetsliceVld());
    }
    
    /**
     * @return <code>java.util.Map</code> <code>netslicefgd</code>, or <code>null</code> if not present
     */
    @Nullable Map<NetslicefgdKey, Netslicefgd> getNetslicefgd();
    
    /**
     * @return <code>java.util.Map</code> <code>netslicefgd</code>, or an empty list if it is not present
     */
    default @NonNull Map<NetslicefgdKey, Netslicefgd> nonnullNetslicefgd() {
        return CodeHelpers.nonnull(getNetslicefgd());
    }

}


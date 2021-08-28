package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.nsvld.NssConnectionPointRef;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.nsvld.NssConnectionPointRefKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of NetSlice Subnet Virtual Link Descriptors.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * grouping nsvld {
 *   uses nsd-base:vld-common;
 *   list nss-connection-point-ref {
 *     key "nss-ref nsd-connection-point-ref";
 *     leaf nss-ref {
 *       type leafref {
 *         path /nst:nst/nst:netslice-subnet/nst:id;
 *       }
 *     }
 *     leaf nsd-connection-point-ref {
 *       type leafref {
 *         path /nsd:nsd-catalog/nsd:nsd/nsd:connection-point/nsd:name;
 *       }
 *     }
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/nsvld</i>
 *
 */
public interface Nsvld
    extends
    DataObject,
    VldCommon
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nsvld");

    @Override
    Class<? extends Nsvld> implementedInterface();
    
    /**
     * A list of references to connection points.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>nssConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable Map<NssConnectionPointRefKey, NssConnectionPointRef> getNssConnectionPointRef();
    
    /**
     * @return <code>java.util.Map</code> <code>nssConnectionPointRef</code>, or an empty list if it is not present
     */
    default @NonNull Map<NssConnectionPointRefKey, NssConnectionPointRef> nonnullNssConnectionPointRef() {
        return CodeHelpers.nonnull(getNssConnectionPointRef());
    }

}


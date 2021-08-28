package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.RspCommon;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.rsp.NsdConnectionPointRef;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.rsp.NsdConnectionPointRefKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * grouping rsp {
 *   uses nsd-base:rsp-common;
 *   list nsd-connection-point-ref {
 *     key nsd-ref;
 *     leaf nsd-ref {
 *       type leafref {
 *         path /nsd:nsd-catalog/nsd:nsd/nsd:id;
 *       }
 *     }
 *     leaf order {
 *       type uint8;
 *     }
 *     leaf nsd-connection-point-ref {
 *       type leafref {
 *         path /nsd:nsd-catalog/nsd:nsd/nsd:connection-point/nsd:name;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/rsp</i>
 *
 */
public interface Rsp
    extends
    DataObject,
    RspCommon
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("rsp");

    @Override
    Class<? extends Rsp> implementedInterface();
    
    /**
     * A list of references to connection points.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>nsdConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable Map<NsdConnectionPointRefKey, NsdConnectionPointRef> getNsdConnectionPointRef();
    
    /**
     * @return <code>java.util.Map</code> <code>nsdConnectionPointRef</code>, or an empty list if it is not present
     */
    default @NonNull Map<NsdConnectionPointRefKey, NsdConnectionPointRef> nonnullNsdConnectionPointRef() {
        return CodeHelpers.nonnull(getNsdConnectionPointRef());
    }

}


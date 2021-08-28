package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * grouping connectivity-type {
 *   container connectivity-type {
 *     leaf-list layer-protocol {
 *       type identityref {
 *         base layer-protocol;
 *       }
 *     }
 *     leaf flow-pattern {
 *       type flow-pattern;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/connectivity-type</i>
 *
 */
public interface ConnectivityType
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("connectivity-type");

    @Override
    Class<? extends ConnectivityType> implementedInterface();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.connectivity.type.ConnectivityType</code> <code>connectivityType</code>, or <code>null</code> if not present
     */
    org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.connectivity.type.@Nullable ConnectivityType getConnectivityType();

}


package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments._interface.norev;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VirtualInterface;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * List of Interfaces (external and internal) for the VNF
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>interface</b>
 * <pre>
 * grouping extended-interface {
 *   leaf position {
 *     type uint32;
 *   }
 *   leaf ip-address {
 *     type inet:ip-address;
 *   }
 *   leaf mac-address {
 *     type string;
 *   }
 *   uses common:virtual-interface;
 * }
 * </pre>The schema path to identify an instance is
 * <i>interface/extended-interface</i>
 *
 */
public interface ExtendedInterface
    extends
    DataObject,
    VirtualInterface
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-interface");

    @Override
    Class<? extends ExtendedInterface> implementedInterface();
    
    /**
     * Explicit Position of the interface within the list
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>position</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getPosition();
    
    /**
     * IP address of the internal connection point
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    @Nullable IpAddress getIpAddress();
    
    /**
     * MAC address of the interface. Some VNFs require a specific MAC address to be
     * configured in the interface. While this is not recommended at all in NFV
     * environments, this parameter exists to allow those scenarios. This parameter
     * will be likely deprecated in the future.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>macAddress</code>, or <code>null</code> if not present
     */
    @Nullable String getMacAddress();

}


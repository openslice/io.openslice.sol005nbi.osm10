package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * NSD connection point base
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * grouping nsd-connection-point-common {
 *   leaf name {
 *     type string;
 *   }
 *   leaf floating-ip-required {
 *     type boolean;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-connection-point-common</i>
 *
 */
public interface NsdConnectionPointCommon
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-connection-point-common");

    @Override
    Class<? extends NsdConnectionPointCommon> implementedInterface();
    
    /**
     * Name of the connection point.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Boolean parameter to indicate whether the CP must be exposed. A public IP
     * address will be allocated to this CP if exposed is true. The default is false
     * meaning a floating IP address is not required. It must be explicitly asked for a
     * floating IP address to be allocated.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>floatingIpRequired</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isFloatingIpRequired();

}


package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.various.norev;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ns-various</b>
 * <pre>
 * grouping extended-floating-ip {
 *   leaf floating-ip-required {
 *     type boolean;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ns-various/extended-floating-ip</i>
 *
 */
public interface ExtendedFloatingIp
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-floating-ip");

    @Override
    Class<? extends ExtendedFloatingIp> implementedInterface();
    
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


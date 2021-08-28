package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Parameters for the VNF dashboard
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * container dashboard-params {
 *   leaf path {
 *     type string;
 *   }
 *   leaf https {
 *     type boolean;
 *   }
 *   leaf port {
 *     type inet:port-number;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/mgmt-interface/dashboard-params</i>
 * 
 * <p>To create instances of this class use {@link DashboardParamsBuilder}.
 * @see DashboardParamsBuilder
 *
 */
public interface DashboardParams
    extends
    ChildOf<MgmtInterface>,
    Augmentable<DashboardParams>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("dashboard-params");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams.class;
    }
    
    /**
     * The HTTP path for the dashboard
     *
     *
     *
     * @return <code>java.lang.String</code> <code>path</code>, or <code>null</code> if not present
     */
    @Nullable String getPath();
    
    /**
     * Pick HTTPS instead of HTTP , Default is false
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>https</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isHttps();
    
    /**
     * The HTTP port for the dashboard
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber</code> <code>port</code>, or <code>null</code> if not present
     */
    @Nullable PortNumber getPort();

}


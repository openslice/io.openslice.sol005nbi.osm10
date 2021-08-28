package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.EndpointType;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Use the ip address associated with this connection point. This cp is then 
 * considered as management.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case cp {
 *   leaf cp {
 *     type leafref {
 *       path ../../connection-point/name;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/mgmt-interface/endpoint-type/cp</i>
 *
 */
public interface Cp
    extends
    DataObject,
    Augmentable<Cp>,
    EndpointType
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("cp");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>cp</code>, or <code>null</code> if not present
     */
    @Nullable String getCp();

}


package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.extended.vdu.SupplementalBootData;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>various</b>
 * <pre>
 * grouping extended-vdu {
 *   leaf pdu-type {
 *     type string;
 *   }
 *   container supplemental-boot-data {
 *     leaf boot-data-drive {
 *       type boolean;
 *       default false;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>various/extended-vdu</i>
 *
 */
public interface ExtendedVdu
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-vdu");

    @Override
    Class<? extends ExtendedVdu> implementedInterface();
    
    /**
     * Type of PDU. If this field exists, the deployment unit must be understood as a
     * PDU, not as a VDU. This field is used to identify the category of PDU instances
     * to be used at instantiation time. For the instantiation to be successful, there
     * must be available PDU instances of this type in the selected datacenter.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>pduType</code>, or <code>null</code> if not present
     */
    @Nullable String getPduType();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.extended.vdu.SupplementalBootData</code> <code>supplementalBootData</code>, or <code>null</code> if not present
     */
    @Nullable SupplementalBootData getSupplementalBootData();

}


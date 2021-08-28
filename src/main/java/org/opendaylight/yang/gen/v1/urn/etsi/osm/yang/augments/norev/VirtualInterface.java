package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>common-augments</b>
 * <pre>
 * grouping virtual-interface {
 *   container virtual-interface {
 *     leaf type {
 *       type enumeration {
 *         enum PARAVIRT;
 *         enum OM-MGMT;
 *         enum PCI-PASSTHROUGH;
 *         enum SR-IOV;
 *         enum VIRTIO;
 *         enum E1000;
 *         enum RTL8139;
 *         enum PCNET;
 *       }
 *       default PARAVIRT;
 *     }
 *     leaf vpci {
 *       type string;
 *     }
 *     leaf bandwidth {
 *       type uint64;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>common-augments/virtual-interface</i>
 *
 */
public interface VirtualInterface
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-interface");

    @Override
    Class<? extends VirtualInterface> implementedInterface();
    
    /**
     * Container for the virtual interface properties
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.virtual._interface.VirtualInterface</code> <code>virtualInterface</code>, or <code>null</code> if not present
     */
    org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.virtual._interface.@Nullable VirtualInterface getVirtualInterface();

}


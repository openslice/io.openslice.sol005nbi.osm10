package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.virtual._interface;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.$YangModuleInfoImpl;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Container for the virtual interface properties
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>common-augments</b>
 * <pre>
 * container virtual-interface {
 *   leaf type {
 *     type enumeration {
 *       enum PARAVIRT;
 *       enum OM-MGMT;
 *       enum PCI-PASSTHROUGH;
 *       enum SR-IOV;
 *       enum VIRTIO;
 *       enum E1000;
 *       enum RTL8139;
 *       enum PCNET;
 *     }
 *     default PARAVIRT;
 *   }
 *   leaf vpci {
 *     type string;
 *   }
 *   leaf bandwidth {
 *     type uint64;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>common-augments/virtual-interface/virtual-interface</i>
 * 
 * <p>To create instances of this class use {@link VirtualInterfaceBuilder}.
 * @see VirtualInterfaceBuilder
 *
 */
public interface VirtualInterface
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VirtualInterface>,
    Augmentable<VirtualInterface>
{


    public enum Type implements Enumeration {
        PARAVIRT(0, "PARAVIRT"),
        
        OMMGMT(1, "OM-MGMT"),
        
        PCIPASSTHROUGH(2, "PCI-PASSTHROUGH"),
        
        SRIOV(3, "SR-IOV"),
        
        VIRTIO(4, "VIRTIO"),
        
        E1000(5, "E1000"),
        
        RTL8139(6, "RTL8139"),
        
        PCNET(7, "PCNET")
        ;
    
        private static final Map<String, Type> NAME_MAP;
        private static final Map<Integer, Type> VALUE_MAP;
    
        static {
            final Builder<String, Type> nb = ImmutableMap.builder();
            final Builder<Integer, Type> vb = ImmutableMap.builder();
            for (Type enumItem : Type.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private Type(int value, String name) {
            this.value = value;
            this.name = name;
        }
    
        @Override
        public String getName() {
            return name;
        }
    
        @Override
        public int getIntValue() {
            return value;
        }
    
        /**
         * Return the enumeration member whose {@link #getName()} matches specified value.
         *
         * @param name YANG assigned name
         * @return corresponding Type item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<Type> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding Type item, or null if no such item exists
         */
        public static Type forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-interface");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.virtual._interface.VirtualInterface> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.virtual._interface.VirtualInterface.class;
    }
    
    /**
     * Specifies the type of virtual interface between VM and host. PARAVIRT : Use the
     * default paravirtualized interface for the VIM (virtio, vmxnet3, etc.). VIRTIO :
     * Deprecated! Use the traditional VIRTIO interface. PCI-PASSTHROUGH : Use
     * PCI-PASSTHROUGH interface. SR-IOV : Use SR-IOV interface. E1000 : Emulate E1000
     * interface. RTL8139 : Emulate RTL8139 interface. PCNET : Emulate PCNET interface.
     * OM-MGMT : Deprecated! Use PARAVIRT instead and set the VNF management interface
     * at vnfd:mgmt-interface:cp
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.virtual._interface.VirtualInterface.Type</code> <code>type</code>, or <code>null</code> if not present
     */
    @Nullable Type getType();
    
    /**
     * Specifies the virtual PCI address. Expressed in the following format
     * dddd:dd:dd.d. For example 0000:00:12.0. This information can be used to pass as
     * metadata during the VM creation.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vpci</code>, or <code>null</code> if not present
     */
    @Nullable String getVpci();
    
    /**
     * Aggregate bandwidth of the NIC.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>bandwidth</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getBandwidth();

}


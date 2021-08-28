package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.virtual._interface;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Container for the virtual interface properties
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * container virtual-interface {
 *   leaf type {
 *     type enumeration {
 *       enum PARAVIRT;
 *       enum VIRTIO;
 *       enum PCI-PASSTHROUGH;
 *       enum SR-IOV;
 *     }
 *   }
 *   leaf bandwidth {
 *     type uint64;
 *   }
 *   leaf ovs-offload {
 *     type enumeration {
 *       enum MANDATORY;
 *       enum PREFERRED;
 *     }
 *   }
 *   leaf vendor-id {
 *     type string;
 *   }
 *   leaf datapath-library {
 *     type string;
 *   }
 *   leaf provider-network-name {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/virtual-interface/virtual-interface</i>
 * 
 * <p>To create instances of this class use {@link VirtualInterfaceBuilder}.
 * @see VirtualInterfaceBuilder
 *
 */
public interface VirtualInterface
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.VirtualInterface>,
    Augmentable<VirtualInterface>
{


    public enum Type implements Enumeration {
        PARAVIRT(0, "PARAVIRT"),
        
        VIRTIO(1, "VIRTIO"),
        
        PCIPASSTHROUGH(2, "PCI-PASSTHROUGH"),
        
        SRIOV(3, "SR-IOV")
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
    
    public enum OvsOffload implements Enumeration {
        MANDATORY(0, "MANDATORY"),
        
        PREFERRED(1, "PREFERRED")
        ;
    
        private static final Map<String, OvsOffload> NAME_MAP;
        private static final Map<Integer, OvsOffload> VALUE_MAP;
    
        static {
            final Builder<String, OvsOffload> nb = ImmutableMap.builder();
            final Builder<Integer, OvsOffload> vb = ImmutableMap.builder();
            for (OvsOffload enumItem : OvsOffload.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private OvsOffload(int value, String name) {
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
         * @return corresponding OvsOffload item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<OvsOffload> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding OvsOffload item, or null if no such item exists
         */
        public static OvsOffload forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-interface");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.virtual._interface.VirtualInterface> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.virtual._interface.VirtualInterface.class;
    }
    
    /**
     * Specifies the type of virtual interface between VM and host. PARAVIRT : Use the
     * default paravirtualized interface for the VIM (virtio, vmxnet3, etc.). VIRTIO :
     * Deprecated! Use the traditional VIRTIO interface. PCI-PASSTHROUGH : Use
     * PCI-PASSTHROUGH interface. SR-IOV : Use SR-IOV interface.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.virtual._interface.VirtualInterface.Type</code> <code>type</code>, or <code>null</code> if not present
     */
    @Nullable Type getType();
    
    /**
     * Aggregate bandwidth of the NIC.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>bandwidth</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getBandwidth();
    
    /**
     * Defines if the NIC supports OVS offload. MANDATORY : OVS offload support in the
     * NIC is mandatory. PREFERRED : OVS offload support in the NIC is preferred.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.virtual._interface.VirtualInterface.OvsOffload</code> <code>ovsOffload</code>, or <code>null</code> if not present
     */
    @Nullable OvsOffload getOvsOffload();
    
    /**
     * Specifies the vendor specific id for the device. This is used when a NIC from
     * specific HW vendor is required.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vendorId</code>, or <code>null</code> if not present
     */
    @Nullable String getVendorId();
    
    /**
     * Specifies the name and version of the datapath library the NIC is expected to
     * support.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>datapathLibrary</code>, or <code>null</code> if not present
     */
    @Nullable String getDatapathLibrary();
    
    /**
     * Name of the provider network to which this NIC is attached.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>providerNetworkName</code>, or <code>null</code> if not present
     */
    @Nullable String getProviderNetworkName();

}


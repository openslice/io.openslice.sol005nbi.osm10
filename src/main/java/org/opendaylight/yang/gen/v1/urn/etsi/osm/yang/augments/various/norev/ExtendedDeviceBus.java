package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev;
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
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>various</b>
 * <pre>
 * grouping extended-device-bus {
 *   leaf device-bus {
 *     type enumeration {
 *       enum ide;
 *       enum usb;
 *       enum virtio;
 *       enum scsi;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>various/extended-device-bus</i>
 *
 */
public interface ExtendedDeviceBus
    extends
    DataObject
{


    public enum DeviceBus implements Enumeration {
        Ide(0, "ide"),
        
        Usb(1, "usb"),
        
        Virtio(2, "virtio"),
        
        Scsi(3, "scsi")
        ;
    
        private static final Map<String, DeviceBus> NAME_MAP;
        private static final Map<Integer, DeviceBus> VALUE_MAP;
    
        static {
            final Builder<String, DeviceBus> nb = ImmutableMap.builder();
            final Builder<Integer, DeviceBus> vb = ImmutableMap.builder();
            for (DeviceBus enumItem : DeviceBus.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private DeviceBus(int value, String name) {
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
         * @return corresponding DeviceBus item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<DeviceBus> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding DeviceBus item, or null if no such item exists
         */
        public static DeviceBus forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-device-bus");

    @Override
    Class<? extends ExtendedDeviceBus> implementedInterface();
    
    /**
     * Type of disk-bus on which this disk is exposed to guest
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.ExtendedDeviceBus.DeviceBus</code> <code>deviceBus</code>, or <code>null</code> if not present
     */
    @Nullable DeviceBus getDeviceBus();

}


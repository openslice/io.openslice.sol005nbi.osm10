package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.GuestEpa;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * List of pcie passthrough devices.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list pcie-device {
 *   key device-id;
 *   leaf device-id {
 *     type string;
 *   }
 *   leaf count {
 *     type uint64;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/pcie-device</i>
 * 
 * <p>To create instances of this class use {@link PcieDeviceBuilder}.
 * @see PcieDeviceBuilder
 * @see PcieDeviceKey
 *
 */
public interface PcieDevice
    extends
    ChildOf<GuestEpa>,
    Augmentable<PcieDevice>,
    Identifiable<PcieDeviceKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("pcie-device");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.PcieDevice> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.PcieDevice.class;
    }
    
    /**
     * Device identifier.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>deviceId</code>, or <code>null</code> if not present
     */
    @Nullable String getDeviceId();
    
    /**
     * Number of devices to attach to the VM.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>count</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getCount();
    
    @Override
    PcieDeviceKey key();

}


package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.sw.image.desc.Checksum;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Defines descriptors of software images to be used by the VNF.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list sw-image-desc {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf version {
 *     type string;
 *   }
 *   container checksum {
 *     leaf algorithm {
 *       type identityref {
 *         base checksum-algorithm;
 *       }
 *     }
 *     leaf hash {
 *       type string;
 *     }
 *   }
 *   leaf container-format {
 *     default bare;
 *     type enumeration {
 *       enum aki {
 *       }
 *       enum ami {
 *       }
 *       enum ari {
 *       }
 *       enum bare {
 *       }
 *       enum docker {
 *       }
 *       enum ova {
 *       }
 *       enum ovf {
 *       }
 *     }
 *   }
 *   leaf disk-format {
 *     default qcow2;
 *     type enumeration {
 *       enum aki {
 *       }
 *       enum ami {
 *       }
 *       enum ari {
 *       }
 *       enum iso {
 *       }
 *       enum qcow2 {
 *       }
 *       enum raw {
 *       }
 *       enum vdi {
 *       }
 *       enum vhd {
 *       }
 *       enum vhdx {
 *       }
 *       enum vmdk {
 *       }
 *     }
 *   }
 *   leaf min-disk {
 *     type uint64;
 *     units GB;
 *   }
 *   leaf min-ram {
 *     type decimal64 {
 *       fraction-digits 1;
 *       range 0..max;
 *     }
 *     units GB;
 *     default 0;
 *   }
 *   leaf size {
 *     type uint64;
 *     units GB;
 *   }
 *   leaf image {
 *     default .;
 *     type inet:uri;
 *   }
 *   leaf operating-system {
 *     type string;
 *   }
 *   leaf-list supported-virtualization-environment {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/sw-image-desc</i>
 * 
 * <p>To create instances of this class use {@link SwImageDescBuilder}.
 * @see SwImageDescBuilder
 * @see SwImageDescKey
 *
 */
public interface SwImageDesc
    extends
    ChildOf<Vnfd>,
    Augmentable<SwImageDesc>,
    Identifiable<SwImageDescKey>
{


    public enum ContainerFormat implements Enumeration {
        /**
         * An Amazon kernel image.
         *
         */
        Aki(0, "aki"),
        
        /**
         * An Amazon machine image.
         *
         */
        Ami(1, "ami"),
        
        /**
         * An Amazon ramdisk image.
         *
         */
        Ari(2, "ari"),
        
        /**
         * The image does not have a container or metadata envelope.
         *
         */
        Bare(3, "bare"),
        
        /**
         * A docker container format.
         *
         */
        Docker(4, "docker"),
        
        /**
         * An OVF package in a tarfile.
         *
         */
        Ova(5, "ova"),
        
        /**
         * The OVF container format.
         *
         */
        Ovf(6, "ovf")
        ;
    
        private static final Map<String, ContainerFormat> NAME_MAP;
        private static final Map<Integer, ContainerFormat> VALUE_MAP;
    
        static {
            final Builder<String, ContainerFormat> nb = ImmutableMap.builder();
            final Builder<Integer, ContainerFormat> vb = ImmutableMap.builder();
            for (ContainerFormat enumItem : ContainerFormat.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private ContainerFormat(int value, String name) {
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
         * @return corresponding ContainerFormat item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<ContainerFormat> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding ContainerFormat item, or null if no such item exists
         */
        public static ContainerFormat forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }
    
    public enum DiskFormat implements Enumeration {
        /**
         * An Amazon kernel image.
         *
         */
        Aki(0, "aki"),
        
        /**
         * An Amazon machine image.
         *
         */
        Ami(1, "ami"),
        
        /**
         * An Amazon ramdisk image.
         *
         */
        Ari(2, "ari"),
        
        /**
         * An archive format for the data contents of an disk, such as CD-ROM.
         *
         */
        Iso(3, "iso"),
        
        /**
         * Supported by the QEMU emulator that can expand dynamically and supports Copy on
         * Write.
         *
         */
        Qcow2(4, "qcow2"),
        
        /**
         * An unstructured disk image format; if you have a file without an extension it is
         * possibly a raw format.
         *
         */
        Raw(5, "raw"),
        
        /**
         * Supported by VirtualBox virtual machine monitor and the QEMU emulator.
         *
         */
        Vdi(6, "vdi"),
        
        /**
         * The VHD disk format, a common disk format used by virtual machine monitors from
         * VMware, Xen, Microsoft, VirtualBox, and others.
         *
         */
        Vhd(7, "vhd"),
        
        /**
         * The VHDX disk format, an enhanced version of the VHD format, which supports
         * larger disk sizes among other features.
         *
         */
        Vhdx(8, "vhdx"),
        
        /**
         * Common disk format supported by many common virtual machine monitors.
         *
         */
        Vmdk(9, "vmdk")
        ;
    
        private static final Map<String, DiskFormat> NAME_MAP;
        private static final Map<Integer, DiskFormat> VALUE_MAP;
    
        static {
            final Builder<String, DiskFormat> nb = ImmutableMap.builder();
            final Builder<Integer, DiskFormat> vb = ImmutableMap.builder();
            for (DiskFormat enumItem : DiskFormat.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private DiskFormat(int value, String name) {
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
         * @return corresponding DiskFormat item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<DiskFormat> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding DiskFormat item, or null if no such item exists
         */
        public static DiskFormat forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("sw-image-desc");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.SwImageDesc> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.SwImageDesc.class;
    }
    
    /**
     * The identifier of this software image.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * The name of this software image.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * The version of this software image.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>version</code>, or <code>null</code> if not present
     */
    @Nullable String getVersion();
    
    /**
     * The checksum of the software image file.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.sw.image.desc.Checksum</code> <code>checksum</code>, or <code>null</code> if not present
     */
    @Nullable Checksum getChecksum();
    
    /**
     * The container format describes the container file format in which software image
     * is provided.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.SwImageDesc.ContainerFormat</code> <code>containerFormat</code>, or <code>null</code> if not present
     */
    @Nullable ContainerFormat getContainerFormat();
    
    /**
     * The disk format of a software image is the format of the underlying disk image.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.SwImageDesc.DiskFormat</code> <code>diskFormat</code>, or <code>null</code> if not present
     */
    @Nullable DiskFormat getDiskFormat();
    
    /**
     * The minimal disk size requirement for this software image. The value of the
     * 'size of storage' attribute of the VirtualStorageDesc referencing this
     * SwImageDesc shall not be smaller than the value of minDisk.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>minDisk</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getMinDisk();
    
    /**
     * The minimal RAM requirement for this software image. The value of the 'size'
     * attribute of VirtualMemoryData of the Vdu referencing this SwImageDesc shall not
     * be smaller than the value of minRam.
     *
     *
     *
     * @return <code>java.math.BigDecimal</code> <code>minRam</code>, or <code>null</code> if not present
     */
    @Nullable BigDecimal getMinRam();
    
    /**
     * The size of this software image.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>size</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getSize();
    
    /**
     * This is a reference to the actual software image. The reference can be relative
     * to the root of the VNF Package or can be a URL
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri</code> <code>image</code>, or <code>null</code> if not present
     */
    @Nullable Uri getImage();
    
    /**
     * Identifies the operating system used in the software image. This attribute may
     * also identify if a 32 bit or 64 bit software image is used.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>operatingSystem</code>, or <code>null</code> if not present
     */
    @Nullable String getOperatingSystem();
    
    /**
     * Identifies the virtualisation environments (e.g. hypervisor) compatible with
     * this software image.
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportedVirtualizationEnvironment</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getSupportedVirtualizationEnvironment();
    
    @Override
    SwImageDescKey key();

}


package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.k8s.cluster.Nets;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.k8s.cluster.NetsKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * container k8s-cluster {
 *   leaf-list version {
 *     type string;
 *   }
 *   leaf-list cni {
 *     type enumeration {
 *       enum calico;
 *       enum flannel;
 *       enum multus;
 *     }
 *   }
 *   list nets {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/k8s-cluster</i>
 * 
 * <p>To create instances of this class use {@link K8sClusterBuilder}.
 * @see K8sClusterBuilder
 *
 */
public interface K8sCluster
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<K8sCluster>
{


    public enum Cni implements Enumeration {
        Calico(0, "calico"),
        
        Flannel(1, "flannel"),
        
        Multus(2, "multus")
        ;
    
        private static final Map<String, Cni> NAME_MAP;
        private static final Map<Integer, Cni> VALUE_MAP;
    
        static {
            final Builder<String, Cni> nb = ImmutableMap.builder();
            final Builder<Integer, Cni> vb = ImmutableMap.builder();
            for (Cni enumItem : Cni.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private Cni(int value, String name) {
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
         * @return corresponding Cni item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<Cni> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding Cni item, or null if no such item exists
         */
        public static Cni forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("k8s-cluster");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.K8sCluster> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.K8sCluster.class;
    }
    
    /**
     * List of supported K8s versions. The cluster where the KDUs will be deployed will
     * have to match one of these versions.
     *
     *
     *
     * @return <code>java.util.List</code> <code>version</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getVersion();
    
    /**
     * List of supported CNI plugins. The cluster where the KDUs will be deployed will
     * have to use one of these CNI plugins.
     *
     *
     *
     * @return <code>java.util.List</code> <code>cni</code>, or <code>null</code> if not present
     */
    @Nullable List<Cni> getCni();
    
    /**
     * List of required networks in the K8s cluster. The cluster where the KDUs will be
     * deployed will have to use one of these CNI plugins.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>nets</code>, or <code>null</code> if not present
     */
    @Nullable Map<NetsKey, Nets> getNets();
    
    /**
     * @return <code>java.util.Map</code> <code>nets</code>, or an empty list if it is not present
     */
    default @NonNull Map<NetsKey, Nets> nonnullNets() {
        return CodeHelpers.nonnull(getNets());
    }

}


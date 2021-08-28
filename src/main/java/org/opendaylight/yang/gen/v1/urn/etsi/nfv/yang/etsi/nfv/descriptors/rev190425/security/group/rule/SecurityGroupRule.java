package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.security.group.rule;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint16;

/**
 * Defines security group rules to be used by the VNF.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list security-group-rule {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   leaf direction {
 *     type enumeration {
 *       enum ingress;
 *       enum egress;
 *     }
 *     default ingress;
 *   }
 *   leaf ether-type {
 *     type enumeration {
 *       enum ipv4;
 *       enum ipv6;
 *     }
 *     default ipv4;
 *   }
 *   leaf protocol {
 *     type enumeration {
 *       enum tcp;
 *       enum udp;
 *       enum icmp;
 *     }
 *     default tcp;
 *   }
 *   leaf port-range-min {
 *     must ". &lt;= ../port-range-max";
 *     type uint16;
 *     default 0;
 *   }
 *   leaf port-range-max {
 *     must ". &gt;= ../port-range-min";
 *     type uint16;
 *     default 65535;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/security-group-rule/security-group-rule</i>
 * 
 * <p>To create instances of this class use {@link SecurityGroupRuleBuilder}.
 * @see SecurityGroupRuleBuilder
 * @see SecurityGroupRuleKey
 *
 */
public interface SecurityGroupRule
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityGroupRule>,
    Augmentable<SecurityGroupRule>,
    Identifiable<SecurityGroupRuleKey>
{


    public enum Direction implements Enumeration {
        Ingress(0, "ingress"),
        
        Egress(1, "egress")
        ;
    
        private static final Map<String, Direction> NAME_MAP;
        private static final Map<Integer, Direction> VALUE_MAP;
    
        static {
            final Builder<String, Direction> nb = ImmutableMap.builder();
            final Builder<Integer, Direction> vb = ImmutableMap.builder();
            for (Direction enumItem : Direction.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private Direction(int value, String name) {
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
         * @return corresponding Direction item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<Direction> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding Direction item, or null if no such item exists
         */
        public static Direction forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }
    
    public enum EtherType implements Enumeration {
        Ipv4(0, "ipv4"),
        
        Ipv6(1, "ipv6")
        ;
    
        private static final Map<String, EtherType> NAME_MAP;
        private static final Map<Integer, EtherType> VALUE_MAP;
    
        static {
            final Builder<String, EtherType> nb = ImmutableMap.builder();
            final Builder<Integer, EtherType> vb = ImmutableMap.builder();
            for (EtherType enumItem : EtherType.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private EtherType(int value, String name) {
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
         * @return corresponding EtherType item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<EtherType> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding EtherType item, or null if no such item exists
         */
        public static EtherType forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }
    
    public enum Protocol implements Enumeration {
        Tcp(0, "tcp"),
        
        Udp(1, "udp"),
        
        Icmp(2, "icmp")
        ;
    
        private static final Map<String, Protocol> NAME_MAP;
        private static final Map<Integer, Protocol> VALUE_MAP;
    
        static {
            final Builder<String, Protocol> nb = ImmutableMap.builder();
            final Builder<Integer, Protocol> vb = ImmutableMap.builder();
            for (Protocol enumItem : Protocol.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private Protocol(int value, String name) {
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
         * @return corresponding Protocol item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<Protocol> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding Protocol item, or null if no such item exists
         */
        public static Protocol forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("security-group-rule");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.security.group.rule.SecurityGroupRule> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.security.group.rule.SecurityGroupRule.class;
    }
    
    /**
     * Identifier of this SecurityGroupRule information element.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Human readable description of the security group rule.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable String getDescription();
    
    /**
     * The direction in which the security group rule is applied. Permitted values:
     * INGRESS, EGRESS. Defaults to INGRESS.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.security.group.rule.SecurityGroupRule.Direction</code> <code>direction</code>, or <code>null</code> if not present
     */
    @Nullable Direction getDirection();
    
    /**
     * Indicates the protocol carried over the Ethernet layer. Permitted values: IPV4,
     * IPV6. Defaults to IPV4.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.security.group.rule.SecurityGroupRule.EtherType</code> <code>etherType</code>, or <code>null</code> if not present
     */
    @Nullable EtherType getEtherType();
    
    /**
     * Indicates the protocol carried over the IP layer. Permitted values: any protocol
     * defined in the IANA protocol registry, e.g. TCP, UDP, ICMP, etc. Defaults to
     * TCP.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.security.group.rule.SecurityGroupRule.Protocol</code> <code>protocol</code>, or <code>null</code> if not present
     */
    @Nullable Protocol getProtocol();
    
    /**
     * Indicates minimum port number in the range that is matched by the security group
     * rule. Defaults to 0.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint16</code> <code>portRangeMin</code>, or <code>null</code> if not present
     */
    @Nullable Uint16 getPortRangeMin();
    
    /**
     * Indicates maximum port number in the range that is matched by the security group
     * rule. Defaults to 65535.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint16</code> <code>portRangeMax</code>, or <code>null</code> if not present
     */
    @Nullable Uint16 getPortRangeMax();
    
    @Override
    SecurityGroupRuleKey key();

}


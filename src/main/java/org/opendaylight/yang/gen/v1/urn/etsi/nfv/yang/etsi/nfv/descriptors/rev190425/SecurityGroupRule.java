package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.security.group.rule.SecurityGroupRuleKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * grouping security-group-rule {
 *   list security-group-rule {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     leaf direction {
 *       type enumeration {
 *         enum ingress;
 *         enum egress;
 *       }
 *       default ingress;
 *     }
 *     leaf ether-type {
 *       type enumeration {
 *         enum ipv4;
 *         enum ipv6;
 *       }
 *       default ipv4;
 *     }
 *     leaf protocol {
 *       type enumeration {
 *         enum tcp;
 *         enum udp;
 *         enum icmp;
 *       }
 *       default tcp;
 *     }
 *     leaf port-range-min {
 *       must ". &lt;= ../port-range-max";
 *       type uint16;
 *       default 0;
 *     }
 *     leaf port-range-max {
 *       must ". &gt;= ../port-range-min";
 *       type uint16;
 *       default 65535;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/security-group-rule</i>
 *
 */
public interface SecurityGroupRule
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("security-group-rule");

    @Override
    Class<? extends SecurityGroupRule> implementedInterface();
    
    /**
     * Defines security group rules to be used by the VNF.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>securityGroupRule</code>, or <code>null</code> if not present
     */
    @Nullable Map<SecurityGroupRuleKey, org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.security.group.rule.SecurityGroupRule> getSecurityGroupRule();
    
    /**
     * @return <code>java.util.Map</code> <code>securityGroupRule</code>, or an empty list if it is not present
     */
    default @NonNull Map<SecurityGroupRuleKey, org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.security.group.rule.SecurityGroupRule> nonnullSecurityGroupRule() {
        return CodeHelpers.nonnull(getSecurityGroupRule());
    }

}


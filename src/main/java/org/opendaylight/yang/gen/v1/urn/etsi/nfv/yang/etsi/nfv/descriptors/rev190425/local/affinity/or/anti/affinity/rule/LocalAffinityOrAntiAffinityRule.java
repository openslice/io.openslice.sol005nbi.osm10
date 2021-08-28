package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.local.affinity.or.anti.affinity.rule;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.AffinityScope;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.AffinityType;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list local-affinity-or-anti-affinity-rule {
 *   key "affinity-type affinity-scope";
 *   leaf affinity-type {
 *     type affinity-type;
 *   }
 *   leaf affinity-scope {
 *     type affinity-scope;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/local-affinity-or-anti-affinity-rule/local-affinity-or-anti-affinity-rule</i>
 * 
 * <p>To create instances of this class use {@link LocalAffinityOrAntiAffinityRuleBuilder}.
 * @see LocalAffinityOrAntiAffinityRuleBuilder
 * @see LocalAffinityOrAntiAffinityRuleKey
 *
 */
public interface LocalAffinityOrAntiAffinityRule
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LocalAffinityOrAntiAffinityRule>,
    Augmentable<LocalAffinityOrAntiAffinityRule>,
    Identifiable<LocalAffinityOrAntiAffinityRuleKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("local-affinity-or-anti-affinity-rule");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.local.affinity.or.anti.affinity.rule.LocalAffinityOrAntiAffinityRule> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.local.affinity.or.anti.affinity.rule.LocalAffinityOrAntiAffinityRule.class;
    }
    
    /**
     * Specifies whether the rule is an affinity rule or an anti-affinity rule.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.AffinityType</code> <code>affinityType</code>, or <code>null</code> if not present
     */
    @Nullable AffinityType getAffinityType();
    
    /**
     * Specifies the scope of the rule, possible values are 'NFVI-PoP', 'Zone',
     * 'ZoneGroup', 'NFVI-node'.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.AffinityScope</code> <code>affinityScope</code>, or <code>null</code> if not present
     */
    @Nullable AffinityScope getAffinityScope();
    
    @Override
    LocalAffinityOrAntiAffinityRuleKey key();

}


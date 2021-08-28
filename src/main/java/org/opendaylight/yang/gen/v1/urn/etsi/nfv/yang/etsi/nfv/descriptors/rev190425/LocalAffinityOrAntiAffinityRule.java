package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.local.affinity.or.anti.affinity.rule.LocalAffinityOrAntiAffinityRuleKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * grouping local-affinity-or-anti-affinity-rule {
 *   list local-affinity-or-anti-affinity-rule {
 *     key "affinity-type affinity-scope";
 *     leaf affinity-type {
 *       type affinity-type;
 *     }
 *     leaf affinity-scope {
 *       type affinity-scope;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/local-affinity-or-anti-affinity-rule</i>
 *
 */
public interface LocalAffinityOrAntiAffinityRule
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("local-affinity-or-anti-affinity-rule");

    @Override
    Class<? extends LocalAffinityOrAntiAffinityRule> implementedInterface();
    
    /**
     * @return <code>java.util.Map</code> <code>localAffinityOrAntiAffinityRule</code>, or <code>null</code> if not present
     */
    @Nullable Map<LocalAffinityOrAntiAffinityRuleKey, org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.local.affinity.or.anti.affinity.rule.LocalAffinityOrAntiAffinityRule> getLocalAffinityOrAntiAffinityRule();
    
    /**
     * @return <code>java.util.Map</code> <code>localAffinityOrAntiAffinityRule</code>, or an empty list if it is not present
     */
    default @NonNull Map<LocalAffinityOrAntiAffinityRuleKey, org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.local.affinity.or.anti.affinity.rule.LocalAffinityOrAntiAffinityRule> nonnullLocalAffinityOrAntiAffinityRule() {
        return CodeHelpers.nonnull(getLocalAffinityOrAntiAffinityRule());
    }

}


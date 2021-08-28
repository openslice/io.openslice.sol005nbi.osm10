package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.deviated.constituent.cpd.id.ConstituentCpdId;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.deviated.constituent.cpd.id.ConstituentCpdIdKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ns-vld</b>
 * <pre>
 * grouping deviated-constituent-cpd-id {
 *   list constituent-cpd-id {
 *     key "constituent-base-element-id constituent-cpd-id";
 *     leaf constituent-base-element-id {
 *       type leafref {
 *         path ../../../nsd:id;
 *       }
 *     }
 *     leaf constituent-cpd-id {
 *       type leafref {
 *         path ../nsd:ext-cpd/nsd:id;
 *       }
 *     }
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ns-vld/deviated-constituent-cpd-id</i>
 *
 */
public interface DeviatedConstituentCpdId
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("deviated-constituent-cpd-id");

    @Override
    Class<? extends DeviatedConstituentCpdId> implementedInterface();
    
    /**
     * Describes a connection point on a VNF/PNF or a SAP which connects to virtual
     * links instantiated from the profile identified in the virtualLinkProfileId
     * attribute.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>constituentCpdId</code>, or <code>null</code> if not present
     */
    @Nullable Map<ConstituentCpdIdKey, ConstituentCpdId> getConstituentCpdId();
    
    /**
     * @return <code>java.util.Map</code> <code>constituentCpdId</code>, or an empty list if it is not present
     */
    default @NonNull Map<ConstituentCpdIdKey, ConstituentCpdId> nonnullConstituentCpdId() {
        return CodeHelpers.nonnull(getConstituentCpdId());
    }

}


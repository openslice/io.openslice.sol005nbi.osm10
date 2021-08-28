package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.pnfd.ExtCpd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.pnfd.ExtCpdKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.pnfd.Security;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.pnfd.SecurityKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * The Pnfd information element is a deployment template enabling on-boarding PNFs 
 * and referencing them from an NSD. It focuses on connectivity aspects only
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * grouping pnfd {
 *   leaf id {
 *     type string;
 *   }
 *   leaf function-description {
 *     type string;
 *   }
 *   leaf provider {
 *     type string;
 *   }
 *   leaf version {
 *     type string;
 *   }
 *   leaf invariant-id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   list ext-cpd {
 *     key id;
 *     uses cpd;
 *   }
 *   list security {
 *     key signature;
 *     uses security-parameters;
 *   }
 *   leaf geographical-location-info {
 *     type string;
 *   }
 *   uses security-group-rule;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/pnfd</i>
 *
 */
public interface Pnfd
    extends
    DataObject,
    SecurityGroupRule
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("pnfd");

    @Override
    Class<? extends Pnfd> implementedInterface();
    
    /**
     * Identifier of this Pnfd information element. It uniquely identifies the PNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Describes the PNF function.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>functionDescription</code>, or <code>null</code> if not present
     */
    @Nullable String getFunctionDescription();
    
    /**
     * Identifies the provider of the PNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>provider</code>, or <code>null</code> if not present
     */
    @Nullable String getProvider();
    
    /**
     * Identifies the version of the PNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>version</code>, or <code>null</code> if not present
     */
    @Nullable String getVersion();
    
    /**
     * Identifies a PNFD in a version independent manner. This attribute is invariant
     * across versions of PNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>invariantId</code>, or <code>null</code> if not present
     */
    @Nullable String getInvariantId();
    
    /**
     * Provides the human readable name of the PNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Specifies the characteristics of one or more connection points where to connect
     * the PNF to a VL.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>extCpd</code>, or <code>null</code> if not present
     */
    @Nullable Map<ExtCpdKey, ExtCpd> getExtCpd();
    
    /**
     * @return <code>java.util.Map</code> <code>extCpd</code>, or an empty list if it is not present
     */
    default @NonNull Map<ExtCpdKey, ExtCpd> nonnullExtCpd() {
        return CodeHelpers.nonnull(getExtCpd());
    }
    
    /**
     * Provides a signature to prevent tampering. Editor's Note: While IFA014 does
     * specify that the PNFD includes a security parameter. SOL001 does not have one.
     * We need to harmonize SOL001 &amp; SOL006 on this point.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>security</code>, or <code>null</code> if not present
     */
    @Nullable Map<SecurityKey, Security> getSecurity();
    
    /**
     * @return <code>java.util.Map</code> <code>security</code>, or an empty list if it is not present
     */
    default @NonNull Map<SecurityKey, Security> nonnullSecurity() {
        return CodeHelpers.nonnull(getSecurity());
    }
    
    /**
     * It provides information about the geographical location (e.g. geographic
     * coordinates or address of the building, etc.) of the PNF. The cardinality 0 is
     * used when the location is unknown. Editor's Note: The type is TBD in SOL001. We
     * need to make a common SOL001/SOL006 decision.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>geographicalLocationInfo</code>, or <code>null</code> if not present
     */
    @Nullable String getGeographicalLocationInfo();

}


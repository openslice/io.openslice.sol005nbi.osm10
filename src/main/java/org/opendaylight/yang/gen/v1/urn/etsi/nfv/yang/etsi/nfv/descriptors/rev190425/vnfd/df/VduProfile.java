package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LocalAffinityOrAntiAffinityRule;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Df;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.VduProfileBuilder.VduProfileImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.vdu.profile.AffinityOrAntiAffinityGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.vdu.profile.AffinityOrAntiAffinityGroupKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint16;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * The Vduprofile describes additional instantiation data for a given VDU used in 
 * deployment flavour.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list vdu-profile {
 *   key id;
 *   min-elements 1;
 *   leaf id {
 *     type leafref {
 *       path ../../../vdu/id;
 *     }
 *   }
 *   leaf min-number-of-instances {
 *     type uint16;
 *     default 1;
 *   }
 *   leaf max-number-of-instances {
 *     type uint16;
 *     default 1;
 *     must ". &gt;= ../min-number-of-instances";
 *   }
 *   uses local-affinity-or-anti-affinity-rule;
 *   list affinity-or-anti-affinity-group {
 *     key id;
 *     leaf id {
 *       type leafref {
 *         path ../../../affinity-or-anti-affinity-group/id;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/df/vdu-profile</i>
 * 
 * <p>To create instances of this class use {@link VduProfileBuilder}.
 * @see VduProfileBuilder
 * @see VduProfileKey
 *
 */
@JsonDeserialize(as = VduProfileImpl.class)
@JsonIgnoreProperties(value = {"localAffinityOrAntiAffinityRule"}, ignoreUnknown = true)
public interface VduProfile
    extends
    ChildOf<Df>,
    Augmentable<VduProfile>,
    LocalAffinityOrAntiAffinityRule,
    Identifiable<VduProfileKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-profile");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.VduProfile> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.VduProfile.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Minimum number of instances of the VNFC based on this VDU that is permitted to
     * exist for this flavour.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint16</code> <code>minNumberOfInstances</code>, or <code>null</code> if not present
     */
    @Nullable Uint16 getMinNumberOfInstances();
    
    /**
     * @return <code>org.opendaylight.yangtools.yang.common.Uint16</code> <code>maxNumberOfInstances</code>, or <code>null</code> if not present
     */
    @Nullable Uint16 getMaxNumberOfInstances();
    
    /**
     * Identifier(s) of the affinity or anti-affinity group(s) the VDU belongs to.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>affinityOrAntiAffinityGroup</code>, or <code>null</code> if not present
     */
    @Nullable Map<AffinityOrAntiAffinityGroupKey, AffinityOrAntiAffinityGroup> getAffinityOrAntiAffinityGroup();
    
    /**
     * @return <code>java.util.Map</code> <code>affinityOrAntiAffinityGroup</code>, or an empty list if it is not present
     */
    default @NonNull Map<AffinityOrAntiAffinityGroupKey, AffinityOrAntiAffinityGroup> nonnullAffinityOrAntiAffinityGroup() {
        return CodeHelpers.nonnull(getAffinityOrAntiAffinityGroup());
    }
    
    @Override
    VduProfileKey key();

}


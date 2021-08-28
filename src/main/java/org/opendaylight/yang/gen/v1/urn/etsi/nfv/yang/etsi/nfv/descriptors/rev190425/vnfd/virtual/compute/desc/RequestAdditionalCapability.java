package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualComputeDesc;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.request.additional.capability.TargetPerformanceParameters;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.request.additional.capability.TargetPerformanceParametersKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list request-additional-capability {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf support-mandatory {
 *     type boolean;
 *   }
 *   leaf min-version {
 *     type string;
 *   }
 *   leaf preferred-version {
 *     type string;
 *   }
 *   list target-performance-parameters {
 *     key key;
 *     leaf key {
 *       type string;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/virtual-compute-desc/request-additional-capability</i>
 * 
 * <p>To create instances of this class use {@link RequestAdditionalCapabilityBuilder}.
 * @see RequestAdditionalCapabilityBuilder
 * @see RequestAdditionalCapabilityKey
 *
 */
public interface RequestAdditionalCapability
    extends
    ChildOf<VirtualComputeDesc>,
    Augmentable<RequestAdditionalCapability>,
    Identifiable<RequestAdditionalCapabilityKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("request-additional-capability");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.RequestAdditionalCapability> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.RequestAdditionalCapability.class;
    }
    
    /**
     * Identifies a requested additional capability for the VDU. ETSI GS NFV-IFA 002
     * [i.1] describes acceleration capabilities.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Indicates whether the requested additional capability is mandatory for
     * successful operation.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>supportMandatory</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isSupportMandatory();
    
    /**
     * Identifies the minimum version of the requested additional capability.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>minVersion</code>, or <code>null</code> if not present
     */
    @Nullable String getMinVersion();
    
    /**
     * Identifies the preferred version of the requested additional capability.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>preferredVersion</code>, or <code>null</code> if not present
     */
    @Nullable String getPreferredVersion();
    
    /**
     * Identifies specific attributes, dependent on the requested additional capability
     * type.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>targetPerformanceParameters</code>, or <code>null</code> if not present
     */
    @Nullable Map<TargetPerformanceParametersKey, TargetPerformanceParameters> getTargetPerformanceParameters();
    
    /**
     * @return <code>java.util.Map</code> <code>targetPerformanceParameters</code>, or an empty list if it is not present
     */
    default @NonNull Map<TargetPerformanceParametersKey, TargetPerformanceParameters> nonnullTargetPerformanceParameters() {
        return CodeHelpers.nonnull(getTargetPerformanceParameters());
    }
    
    @Override
    RequestAdditionalCapabilityKey key();

}


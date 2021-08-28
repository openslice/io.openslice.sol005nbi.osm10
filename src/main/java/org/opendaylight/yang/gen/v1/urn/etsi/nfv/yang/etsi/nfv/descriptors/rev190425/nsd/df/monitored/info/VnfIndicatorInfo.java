package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.monitored.info;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.MonitoredInfo;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Uniquely identifies this VNF Indicator information element.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container vnf-indicator-info {
 *   leaf vnfd-id {
 *     type leafref {
 *       path ../../../../../vnfd/id;
 *     }
 *   }
 *   leaf vnf-indicator {
 *     type leafref {
 *       path deref(../vnfd-id)/../indicator/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/df/monitored-info/vnf-indicator-info</i>
 * 
 * <p>To create instances of this class use {@link VnfIndicatorInfoBuilder}.
 * @see VnfIndicatorInfoBuilder
 *
 */
public interface VnfIndicatorInfo
    extends
    ChildOf<MonitoredInfo>,
    Augmentable<VnfIndicatorInfo>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-indicator-info");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.monitored.info.VnfIndicatorInfo> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.monitored.info.VnfIndicatorInfo.class;
    }
    
    /**
     * Identifies a VNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfdId</code>, or <code>null</code> if not present
     */
    @Nullable String getVnfdId();
    
    /**
     * Identifies a VNF indicator within the VNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfIndicator</code>, or <code>null</code> if not present
     */
    @Nullable String getVnfIndicator();

}


package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd._int.virtual.link.desc;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.MonitoringParameter;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.IntVirtualLinkDesc;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list monitoring-parameters {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   uses monitoring-parameter;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/int-virtual-link-desc/monitoring-parameters</i>
 * 
 * <p>To create instances of this class use {@link MonitoringParametersBuilder}.
 * @see MonitoringParametersBuilder
 * @see MonitoringParametersKey
 *
 */
public interface MonitoringParameters
    extends
    ChildOf<IntVirtualLinkDesc>,
    Augmentable<MonitoringParameters>,
    MonitoringParameter,
    Identifiable<MonitoringParametersKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("monitoring-parameters");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd._int.virtual.link.desc.MonitoringParameters> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd._int.virtual.link.desc.MonitoringParameters.class;
    }
    
    /**
     * Unique identifier of the monitoring parameter.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    @Override
    MonitoringParametersKey key();

}


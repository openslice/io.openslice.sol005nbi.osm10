package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Vdu;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list monitoring-parameter {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   uses monitoring-parameter;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/vdu/monitoring-parameter</i>
 * 
 * <p>To create instances of this class use {@link MonitoringParameterBuilder}.
 * @see MonitoringParameterBuilder
 * @see MonitoringParameterKey
 *
 */
public interface MonitoringParameter
    extends
    ChildOf<Vdu>,
    Augmentable<MonitoringParameter>,
    org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.MonitoringParameter,
    Identifiable<MonitoringParameterKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("monitoring-parameter");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu.MonitoringParameter> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu.MonitoringParameter.class;
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
    MonitoringParameterKey key();

}


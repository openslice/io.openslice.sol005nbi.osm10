package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.monitoring.param.value;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamValue;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container numeric-constraints {
 *   leaf min-value {
 *     type uint64;
 *   }
 *   leaf max-value {
 *     type uint64;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/monitoring-param-value/numeric-constraints</i>
 * 
 * <p>To create instances of this class use {@link NumericConstraintsBuilder}.
 * @see NumericConstraintsBuilder
 *
 */
public interface NumericConstraints
    extends
    ChildOf<MonitoringParamValue>,
    Augmentable<NumericConstraints>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("numeric-constraints");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.monitoring.param.value.NumericConstraints> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.monitoring.param.value.NumericConstraints.class;
    }
    
    /**
     * Minimum value for the parameter
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>minValue</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getMinValue();
    
    /**
     * Maximum value for the parameter
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>maxValue</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getMaxValue();

}


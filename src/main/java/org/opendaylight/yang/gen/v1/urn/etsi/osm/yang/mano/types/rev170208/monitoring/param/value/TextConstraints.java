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
import org.opendaylight.yangtools.yang.common.Uint8;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container text-constraints {
 *   leaf min-length {
 *     type uint8;
 *   }
 *   leaf max-length {
 *     type uint8;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/monitoring-param-value/text-constraints</i>
 * 
 * <p>To create instances of this class use {@link TextConstraintsBuilder}.
 * @see TextConstraintsBuilder
 *
 */
public interface TextConstraints
    extends
    ChildOf<MonitoringParamValue>,
    Augmentable<TextConstraints>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("text-constraints");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.monitoring.param.value.TextConstraints> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.monitoring.param.value.TextConstraints.class;
    }
    
    /**
     * Minimum string length for the parameter
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint8</code> <code>minLength</code>, or <code>null</code> if not present
     */
    @Nullable Uint8 getMinLength();
    
    /**
     * Maximum string length for the parameter
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint8</code> <code>maxLength</code>, or <code>null</code> if not present
     */
    @Nullable Uint8 getMaxLength();

}


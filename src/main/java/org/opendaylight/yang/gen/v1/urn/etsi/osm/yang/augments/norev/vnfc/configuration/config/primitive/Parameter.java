package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.config.primitive;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.PrimitiveParameter;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.ConfigPrimitive;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of parameters to the config primitive.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>common-augments</b>
 * <pre>
 * list parameter {
 *   key name;
 *   uses primitive-parameter;
 * }
 * </pre>The schema path to identify an instance is
 * <i>common-augments/vnfc-configuration/config-primitive/parameter</i>
 * 
 * <p>To create instances of this class use {@link ParameterBuilder}.
 * @see ParameterBuilder
 * @see ParameterKey
 *
 */
public interface Parameter
    extends
    ChildOf<ConfigPrimitive>,
    Augmentable<Parameter>,
    PrimitiveParameter,
    Identifiable<ParameterKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("parameter");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.config.primitive.Parameter> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.config.primitive.Parameter.class;
    }
    
    @Override
    ParameterKey key();

}


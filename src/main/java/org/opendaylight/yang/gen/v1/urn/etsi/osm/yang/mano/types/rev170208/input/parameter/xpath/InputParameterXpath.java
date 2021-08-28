package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.input.parameter.xpath;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of xpaths to parameters inside the NSD the can be customized during the 
 * instantiation.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list input-parameter-xpath {
 *   key xpath;
 *   leaf xpath {
 *     type string;
 *   }
 *   leaf label {
 *     type string;
 *   }
 *   leaf default-value {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/input-parameter-xpath/input-parameter-xpath</i>
 * 
 * <p>To create instances of this class use {@link InputParameterXpathBuilder}.
 * @see InputParameterXpathBuilder
 * @see InputParameterXpathKey
 *
 */
public interface InputParameterXpath
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.InputParameterXpath>,
    Augmentable<InputParameterXpath>,
    Identifiable<InputParameterXpathKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("input-parameter-xpath");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.input.parameter.xpath.InputParameterXpath> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.input.parameter.xpath.InputParameterXpath.class;
    }
    
    /**
     * An xpath that specifies the element in a descriptor.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>xpath</code>, or <code>null</code> if not present
     */
    @Nullable String getXpath();
    
    /**
     * A descriptive string
     *
     *
     *
     * @return <code>java.lang.String</code> <code>label</code>, or <code>null</code> if not present
     */
    @Nullable String getLabel();
    
    /**
     * Default Value for the Input Parameter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>defaultValue</code>, or <code>null</code> if not present
     */
    @Nullable String getDefaultValue();
    
    @Override
    InputParameterXpathKey key();

}


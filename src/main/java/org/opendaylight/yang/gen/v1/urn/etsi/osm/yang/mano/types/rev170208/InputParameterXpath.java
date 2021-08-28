package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.input.parameter.xpath.InputParameterXpathKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping input-parameter-xpath {
 *   list input-parameter-xpath {
 *     key xpath;
 *     leaf xpath {
 *       type string;
 *     }
 *     leaf label {
 *       type string;
 *     }
 *     leaf default-value {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/input-parameter-xpath</i>
 *
 */
public interface InputParameterXpath
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("input-parameter-xpath");

    @Override
    Class<? extends InputParameterXpath> implementedInterface();
    
    /**
     * List of xpaths to parameters inside the NSD the can be customized during the
     * instantiation.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>inputParameterXpath</code>, or <code>null</code> if not present
     */
    @Nullable Map<InputParameterXpathKey, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.input.parameter.xpath.InputParameterXpath> getInputParameterXpath();
    
    /**
     * @return <code>java.util.Map</code> <code>inputParameterXpath</code>, or an empty list if it is not present
     */
    default @NonNull Map<InputParameterXpathKey, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.input.parameter.xpath.InputParameterXpath> nonnullInputParameterXpath() {
        return CodeHelpers.nonnull(getInputParameterXpath());
    }

}


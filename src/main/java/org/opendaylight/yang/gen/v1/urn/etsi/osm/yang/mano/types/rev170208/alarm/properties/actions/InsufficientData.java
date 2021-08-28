package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.alarm.properties.actions;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.alarm.properties.Actions;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list insufficient-data {
 *   key url;
 *   leaf url {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/alarm-properties/actions/insufficient-data</i>
 * 
 * <p>To create instances of this class use {@link InsufficientDataBuilder}.
 * @see InsufficientDataBuilder
 * @see InsufficientDataKey
 *
 */
public interface InsufficientData
    extends
    ChildOf<Actions>,
    Augmentable<InsufficientData>,
    Identifiable<InsufficientDataKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("insufficient-data");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.alarm.properties.actions.InsufficientData> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.alarm.properties.actions.InsufficientData.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>url</code>, or <code>null</code> if not present
     */
    @Nullable String getUrl();
    
    @Override
    InsufficientDataKey key();

}


package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.alarm.properties.actions;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.alarm.properties.Actions;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>common-augments</b>
 * <pre>
 * list alarm {
 *   key url;
 *   leaf url {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>common-augments/alarm-properties/actions/alarm</i>
 * 
 * <p>To create instances of this class use {@link AlarmBuilder}.
 * @see AlarmBuilder
 * @see AlarmKey
 *
 */
public interface Alarm
    extends
    ChildOf<Actions>,
    Augmentable<Alarm>,
    Identifiable<AlarmKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("alarm");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.alarm.properties.actions.Alarm> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.alarm.properties.actions.Alarm.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>url</code>, or <code>null</code> if not present
     */
    @Nullable String getUrl();
    
    @Override
    AlarmKey key();

}


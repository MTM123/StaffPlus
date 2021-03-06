package net.shortninja.staffplus.server.data;

import net.shortninja.staffplus.player.attribute.Ticket;
import net.shortninja.staffplus.unordered.IReport;
import net.shortninja.staffplus.unordered.IWarning;
import org.bukkit.Bukkit;

import java.util.List;
import java.util.UUID;

public class MySQLStorage implements IStorage {

    private final MySQLConnection connection;

    public MySQLStorage(MySQLConnection connection) {
        this.connection = connection;
    }

    @Override
    public void onEnable() {
        if (connection.init())
            Bukkit.getLogger().info("Database created");
    }

    @Override
    public void onDisable() {
        connection.kill();
    }

    @Override
    public String getPassword(UUID uuid) {
        return null;
    }

    @Override
    public void setPassword(UUID uuid, String password) {

    }

    @Override
    public short getGlassColor(UUID uuid) {
        return 0;
    }

    @Override
    public void setGlassColor(UUID uuid, short color) {

    }

    @Override
    public List<IReport> getReports(UUID uuid) {
        return null;
    }

    @Override
    public List<IWarning> getWarnings(UUID uuid) {
        return null;
    }

    @Override
    public void addReport(IReport report) {

    }

    @Override
    public void addWarning(IWarning warning) {

    }

    @Override
    public void removeReport(UUID uuid) {

    }

    @Override
    public void removeWarning(UUID uuid) {

    }

    @Override
    public Ticket getTicketByUUID(UUID uuid) {
        return null;
    }

    @Override
    public Ticket getTickById(int id) {
        return null;
    }

    @Override
    public void addTicket(Ticket ticket) {

    }

    @Override
    public void removeTicket(UUID uuid) {

    }
}
